package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SubjectActivity extends AppCompatActivity {

    private static final String EXTRA_SUBJECTID = "subjectID";
    private static final String EXTRA_SUBJECTPAGENUM = "pageID";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
        int subjectID = (int) getIntent().getExtras().get(EXTRA_SUBJECTID);
        int pageID = (int) getIntent().getExtras().get(EXTRA_SUBJECTPAGENUM);
        TextView titleText = findViewById(R.id.textView);
        TextView codeText = findViewById(R.id.textView2);
        TextView descText = findViewById(R.id.textView3);
        switch (pageID) {
            case 0:
                Subjects firstSub = Subjects.firstYearSubject[subjectID];
                titleText.setText(firstSub.getSubjectName());
                codeText.setText(firstSub.getSubjectCode());
                descText.setText(firstSub.getDescription());
                break;
            case 1:
                Subjects secondSub = Subjects.secondYearSubject[subjectID];
                titleText.setText(secondSub.getSubjectName());
                codeText.setText(secondSub.getSubjectCode());
                descText.setText(secondSub.getDescription());
                break;

        }
    }
}
