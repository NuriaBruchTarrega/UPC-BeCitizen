package com.becitizen.app.becitizen.presentation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.becitizen.app.becitizen.R;

/**
 * Created by Nuria on 18/05/2018.
 */

public class Tab6Utilities extends Fragment {

    private View rootView;

    public Tab6Utilities() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.tab6_utilities, container, false);

        return rootView;
    }
}