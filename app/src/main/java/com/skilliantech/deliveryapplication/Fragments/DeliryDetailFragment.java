package com.skilliantech.deliveryapplication.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.skilliantech.deliveryapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DeliryDetailFragment extends Fragment {


    public DeliryDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_deliry_detail, container, false);
    }

}
