package com.example.myapplication;

import android.os.Bundle;


import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


/**
 * A simple {@link ListFragment} subclass.
 */
public class SecondYearFragment extends ListFragment {

    public SecondYearFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_second_year, container, false);
        String[] names = new String[Subjects.secondYearSubject.length];
        for(int i=0;i<names.length;i++){
            names[i] = Subjects.secondYearSubject[i].getSubjectName();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
