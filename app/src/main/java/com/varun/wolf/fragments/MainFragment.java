package com.varun.wolf.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.varun.wolf.R;

/**
 * Created by VarunBarve on 14/03/2016.
 */
public class MainFragment extends Fragment {

    EditText search;

    ListView mainList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        mainList = (ListView) rootView.findViewById(R.id.main_list);
        search = (EditText) rootView.findViewById(R.id.search_edit);

        search.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    Log.e("SEARCHED TEXT: ", "SEARCHED TEXT: " + search.getText().toString());
                    return true;
                }
                return false;
            }
        });




        return rootView;
    }
}
