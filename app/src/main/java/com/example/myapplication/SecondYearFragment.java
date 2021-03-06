package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;


import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link ListFragment} subclass.
 */
public class SecondYearFragment extends ListFragment {

    public SecondYearFragment() {
        // Required empty public constructor
    }

    interface Listener {
        void itemClicked(long id);
    }

    private FirstYearFragment.Listener listener;

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

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (FirstYearFragment.Listener) context;
    }//This is called when the fragment gets attached to the activity. Remember, the Activity class is a subclass of Context.

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        if (listener != null) {
            listener.itemClicked(id);
        }//Tell the listener when an item in the ListView is clicked.
    }
}
