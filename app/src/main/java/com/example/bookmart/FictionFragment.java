package com.example.bookmart;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by Ark on 12/4/2016.
 */

public class FictionFragment extends Fragment {
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_fiction, container, false);

        //Get button ID
        ImageButton img = (ImageButton) myView.findViewById(R.id.fic1);
        Fragment fragment = new Fragment();
        final android.app.FragmentManager fragmentManager = getFragmentManager();


        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction().replace(R.id.content_frame, new BuyFragment()).commit();
            }
        });
        return myView;
    }
}
