package com.example.android.reportcard;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lleyv_000 on 7/4/2016.
 */
public class ReportCardAdapter extends ArrayAdapter<ReportCard> {

    public ReportCardAdapter(Activity context, ArrayList<ReportCard> reportCards) {
        super(context, 0, reportCards);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Gets the AndroidFlavor object from the ArrayAdapter at the appropriate position
        ReportCard currentReport = getItem(position);

        // Adapters recycle views to AdapterViews.
        // If this is a new View object we're getting, then inflate the layout.
        // If not, this view already has the layout inflated from a previous call to getView,
        // and we modify the View widgets as usual.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView nameTextView = (TextView) convertView.findViewById(R.id.Name);
        nameTextView.setText(currentReport.getStudentName());

        TextView subjectTextView = (TextView) convertView.findViewById(R.id.Subject);
        subjectTextView.setText(currentReport.getSubject());

        TextView gradeTextView = (TextView) convertView.findViewById(R.id.Grade);
        gradeTextView.setText(currentReport.getGrade());

        TextView gpaTextView = (TextView) convertView.findViewById(R.id.GPA);
        gpaTextView.setText(currentReport.getGPA());
        return convertView;
    }
}

