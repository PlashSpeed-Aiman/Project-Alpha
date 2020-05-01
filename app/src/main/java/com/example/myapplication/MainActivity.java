package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FirstYearFragment.Listener {

    private static final String EXTRA_SUBJECTID = "subjectID";
    private static final String EXTRA_SUBJECTBOOLEAN = "boolID";
    private static final String EXTRA_SUBJECTPAGENUM = "pageID";
    private int pageNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);
       final FirstYearFragment firstYearFragment = new FirstYearFragment();
       final SecondYearFragment secondYearFragment = new SecondYearFragment();

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        setFragment(firstYearFragment);
                        setPageNumber(0);
                        break;
                    case 1:
                        setFragment(secondYearFragment);
                        setPageNumber(1);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(this, SubjectActivity.class);
        intent.putExtra(MainActivity.EXTRA_SUBJECTID, (int) id);
        intent.putExtra(MainActivity.EXTRA_SUBJECTPAGENUM, pageNumber);
        startActivity(intent);
    }
    public void setFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame,fragment);
        fragmentTransaction.commit();
    }


    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}


