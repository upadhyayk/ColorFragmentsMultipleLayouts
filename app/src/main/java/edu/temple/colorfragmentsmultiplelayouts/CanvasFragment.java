package edu.temple.colorfragmentsmultiplelayouts;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class CanvasFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private int mParam1;

    public CanvasFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static CanvasFragment newInstance(int param1) {
        CanvasFragment fragment = new CanvasFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getInt(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_canvas, container, false);
        if (mParam1 == 0) {
            view.setBackgroundColor(Color.BLACK);
        } else if (mParam1 == 1) {
            view.setBackgroundColor(Color.BLUE);
        }else if(mParam1 == 2) {
            view.setBackgroundColor(Color.CYAN);
        }else if(mParam1 == 3) {
            view.setBackgroundColor(Color.DKGRAY);
        }else if(mParam1 == 4) {
            view.setBackgroundColor(Color.GRAY);
        }else if(mParam1 == 5) {
            view.setBackgroundColor(Color.GREEN);
        }else if(mParam1 == 6) {
            view.setBackgroundColor(Color.LTGRAY);
        }else if(mParam1 == 7) {
            view.setBackgroundColor(Color.MAGENTA);
        }else if(mParam1 == 8) {
            view.setBackgroundColor(Color.RED);
        }else if(mParam1 == 9) {
            view.setBackgroundColor(Color.TRANSPARENT);
        }else if(mParam1 == 10) {
            view.setBackgroundColor(Color.WHITE);
        }else if(mParam1 == 11) {
            view.setBackgroundColor(Color.YELLOW);
        }
        return view;
    }
}
