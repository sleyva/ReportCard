package com.example.android.reportcard;

/**
 * Created by lleyv_000 on 7/4/2016.
 */
public class ReportCard {

    //Declare private variables
    private String mStudentName;
    private String mSubject;
    private String mGrade;
    private int mGPA;


    //Getter methods
    public String getmStudentName(){ return mStudentName;}
    public String getmSubject(){return mSubject;}
    public String getmGrade(){return mGrade;}
    public int getmGPA(){return mGPA;}

    //Setter methods
    public void setGrade(String grade, int gpa){
        mGrade = grade;
        mGPA = gpa;
    }


    public ReportCard(String studentName, String subject, String grade, int gpa){
        mStudentName = studentName;
        mSubject = subject;
        mGrade = grade;
        mGPA = gpa;
    }

    public String getFullReport() {
        return (mStudentName + " " + mSubject + " " + mGrade + " " + mGPA).toString();
    }
}
