package com.example.NavDrawerUiDemo.drawer.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.NavDrawerUiDemo.R;

/**
 * Created by edison on 1/15/14.
 */
public class GoFragment  extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.go_fragment, container, false);
    }
}