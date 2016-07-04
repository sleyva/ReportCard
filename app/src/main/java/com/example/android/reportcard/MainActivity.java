package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String subject = "Computer Sciences";


        ArrayList<ReportCard> computerScienceReportCards = new ArrayList<ReportCard>();
        computerScienceReportCards.add(new ReportCard("Stephen", subject, "A", 95));
        computerScienceReportCards.add(new ReportCard("Louie", subject, "A", 97));
        computerScienceReportCards.add(new ReportCard("Luis", subject, "A", 98));
        computerScienceReportCards.add(new ReportCard("Loretta", subject, "A", 95));
        computerScienceReportCards.add(new ReportCard("Anthony", subject, "A", 97));
        computerScienceReportCards.add(new ReportCard("Izak", subject, "A", 105));
        computerScienceReportCards.add(new ReportCard("Avery", subject, "A", 95));
        computerScienceReportCards.add(new ReportCard("Alexander", subject, "A", 97));
        computerScienceReportCards.add(new ReportCard("Josh", subject, "A", 98));
        computerScienceReportCards.add(new ReportCard("Daniela", subject, "A", 100));
        computerScienceReportCards.add(new ReportCard("Bonita", subject, "A", 97));
        computerScienceReportCards.add(new ReportCard("Jordan", subject, "A", 98));
        computerScienceReportCards.add(new ReportCard("Bryanna", subject, "A", 95));
        computerScienceReportCards.add(new ReportCard("Kyle", subject, "A", 97));
        computerScienceReportCards.add(new ReportCard("Collin", subject, "A", 98));
        computerScienceReportCards.add(new ReportCard("Yoli", subject, "A", 95));
        computerScienceReportCards.add(new ReportCard("Jessica", subject, "A", 97));
        computerScienceReportCards.add(new ReportCard("Josue", subject, "A", 98));
        computerScienceReportCards.add(new ReportCard("Mommy", subject, "A", 95));
        computerScienceReportCards.add(new ReportCard("Poppy", subject, "A", 97));
        computerScienceReportCards.add(new ReportCard("Diego", subject, "A", 98));
        computerScienceReportCards.add(new ReportCard("Rosa", subject, "A", 95));
        computerScienceReportCards.add(new ReportCard("Rebecca", subject, "A", 97));
        computerScienceReportCards.add(new ReportCard("Estevan", subject, "A", 98));

        ReportCardAdapter adapter = new ReportCardAdapter(this, computerScienceReportCards);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}
