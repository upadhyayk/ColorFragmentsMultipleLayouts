package edu.temple.colorfragmentsmultiplelayouts;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends Activity implements PaletteFragment.OnFragmentInteractionListener  {

    boolean twopane;
    FragmentManager fragmentManager = getFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        twopane = (findViewById(R.id.FragmentCanvasContainer)!= null);

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.FragmentPaletteContainer, new PaletteFragment());
        fragmentTransaction.commit();

        if(twopane){
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.FragmentCanvasContainer, new CanvasFragment());
            fragmentTransaction.commit();
        }


    }

    @Override
    public void nameOfColorSelected(int position){
        CanvasFragment canvasFragment = CanvasFragment.newInstance(position);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if(!twopane){
            transaction.replace(R.id.FragmentPaletteContainer, canvasFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }else{
            transaction.replace(R.id.FragmentCanvasContainer, canvasFragment);
            transaction.addToBackStack(null);
            transaction.commit();

        }

    }

}