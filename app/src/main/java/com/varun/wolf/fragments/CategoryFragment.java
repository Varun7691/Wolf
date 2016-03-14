package com.varun.wolf.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.varun.wolf.R;

import java.util.ArrayList;

/**
 * Created by VarunBarve on 14/03/2016.
 */
public class CategoryFragment extends Fragment {

    ArrayList<String> list;
    ListView listView;
    ArrayAdapter<String> adapter;

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_category, container, false);

        list = new ArrayList<>();

        listView = (ListView) rootView.findViewById(R.id.category_list);

        list.add("Beer");
        list.add("Gin");
        list.add("Liquor");
        list.add("Vermouth");
        list.add("Brandy");
        list.add("Whisky");
        list.add("Wine");
        list.add("Vodka");
        list.add("Rum");
        list.add("Tequila/Agave");

        adapter = new ArrayAdapter<String>(CategoryFragment.this.getActivity(), R.layout.category_list_item, R.id.category_list_item_label, list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
