package com.example.android.reportcard;

/**
 * Created by lleyv_000 on 7/4/2016.
 */
public class ReportCard {

    //Declare private variables
    private String mStudentName;
    private String mSubject;
    private String mGrade;
    private String mGPA;


    //Getter methods
    public String getStudentName() {
        return mStudentName;
    }

    public String getSubject() {
        return mSubject;
    }

    public String getGrade() {
        return mGrade;
    }

    public String getGPA() {
        return mGPA;
    }

    //Returns full report
    public String toString() {
        return (mStudentName + " " + mSubject + " " + mGrade + " " + mGPA).toString();
    }

    //Setter method for teacher
    public void setGrade(String grade, int gpa) {
        mGrade = grade;
        mGPA = Integer.toString(gpa);
    }


    public ReportCard(String studentName, String subject, String grade, int gpa) {
        mStudentName = studentName;
        mSubject = subject;
        mGrade = grade;
        mGPA = Integer.toString(gpa);
    }
}
