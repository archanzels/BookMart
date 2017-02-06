package com.example.bookmart;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by Ark on 12/4/2016.
 */

public class CategoryFragment extends Fragment {
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView= inflater.inflate(R.layout.fragment_category, container, false);

        //Get button ID
        ImageButton img = (ImageButton) myView.findViewById(R.id.category_fic);
        Fragment fragment = new Fragment();
        final android.app.FragmentManager fragmentManager = getFragmentManager();


        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext().getApplicationContext(), "Fiction Clicked", Toast.LENGTH_SHORT).show();
                fragmentManager.beginTransaction().replace(R.id.content_frame, new FictionFragment()).commit();
            }
        });
        return myView;
    }

}
