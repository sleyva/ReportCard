package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard stephen = new ReportCard("Stephen", "Math", "C", 79);
        Log.v("Class iteration test", stephen.getFullReport());
        stephen.setGrade("A", 94);

        TextView main = (TextView) findViewById(R.id.main);
        main.setText(stephen.getFullReport());

        ArrayList<ReportCard> computerScienceReportCards = new ArrayList<ReportCard>();
        computerScienceReportCards.add(new ReportCard("Stephen","Computer Sciences", "A" , 95));
        computerScienceReportCards.add(new ReportCard("Louie", "Computer Sciences", "A", 97));
    }

}
