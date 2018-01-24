package edu.temple.colorfragmentsmultiplelayouts;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by krati on 10/20/17.
 */

public class GridAdapter extends BaseAdapter {
    private Context context;
    private String[] colors;

    public GridAdapter(Context context, String[] colors){
        this.context = context;
        this.colors = colors;

    }

    @Override
    public int getCount() {

        return colors.length;
    }

    @Override
    public Object getItem(int i) {

        return colors[i];
    }

    @Override
    public long getItemId(int i) {

        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        TextView textView;
        if(view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.text_for_palette,null);
        }

        textView = (TextView) view.findViewById(R.id.textViewColors);
        textView.setText(colors[i]);

        if(i == 0){
            textView.setTextColor(Color.WHITE);
            textView.setBackgroundColor(Color.BLACK);
        }else if(i == 1){
            textView.setTextColor(Color.WHITE);
            textView.setBackgroundColor(Color.BLUE);
        }else if(i == 2){
            textView.setTextColor(Color.WHITE);
            textView.setBackgroundColor(Color.CYAN);
        }else if(i == 3){
            textView.setTextColor(Color.WHITE);
            textView.setBackgroundColor(Color.DKGRAY);
        }else if(i == 4){
            textView.setTextColor(Color.WHITE);
            textView.setBackgroundColor(Color.GRAY);
        }else if(i == 5){
            textView.setTextColor(Color.BLACK);
            textView.setBackgroundColor(Color.GREEN);
        }else if(i == 6){
            textView.setTextColor(Color.WHITE);
            textView.setBackgroundColor(Color.LTGRAY);
        }else if(i == 7){
            textView.setTextColor(Color.WHITE);
            textView.setBackgroundColor(Color.MAGENTA);
        }else if(i == 8){
            textView.setTextColor(Color.BLACK);
            textView.setBackgroundColor(Color.RED);
        }else if(i == 9){
            textView.setTextColor(Color.BLACK);
            textView.setBackgroundColor(Color.TRANSPARENT);
        }else if(i == 10) {
            textView.setTextColor(Color.BLACK);
            textView.setBackgroundColor(Color.WHITE);
        }else if (i == 11){
            textView.setTextColor(Color.BLACK);
            textView.setBackgroundColor(Color.YELLOW);
        }

        return view;
    }
}

