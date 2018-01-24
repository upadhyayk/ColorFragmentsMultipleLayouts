package edu.temple.colorfragmentsmultiplelayouts;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;


public class PaletteFragment extends Fragment {
    private OnFragmentInteractionListener mListener;
    Resources resources;
    GridView gridView;

    public PaletteFragment() {
        // Required empty public constructor
    }

    public static PaletteFragment newInstance() {
        return new PaletteFragment();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        resources = getResources();
        String[] colors = resources.getStringArray(R.array.color_array);
        View view = inflater.inflate(R.layout.fragment_palette, container, false);
        gridView = (GridView) view.findViewById(R.id.gridView);
        gridView.setAdapter(new GridAdapter(getActivity(), colors));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //send event to the activity
                mListener.nameOfColorSelected(position);
            }

        });
        return view;

    }


    //check if method implemented in main
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void nameOfColorSelected(int position);
    }
}
