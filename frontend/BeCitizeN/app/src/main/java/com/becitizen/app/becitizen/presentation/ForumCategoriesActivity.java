package com.becitizen.app.becitizen.presentation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.becitizen.app.becitizen.R;
import com.becitizen.app.becitizen.domain.entities.CategoryThread;

import java.util.ArrayList;

import static com.facebook.FacebookSdk.getApplicationContext;

public class ForumCategoriesActivity extends Fragment {

    private View rootView;

    public ForumCategoriesActivity() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.activity_forum_categories, container, false);

        ListView list = (ListView)rootView.findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(rootView.getContext(), R.layout.row_forum_category);
        list.setAdapter(adapter);

        for (int i = 0; i < 4; ++i)
            adapter.add(String.valueOf(i));

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }
        });

        return rootView;
    }

}