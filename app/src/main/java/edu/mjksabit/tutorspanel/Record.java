package edu.mjksabit.tutorspanel;

import androidx.annotation.NonNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Record {
    private int studentId;
    private String details;
    private Date date;

    public Record(int studentId, String details)
    {
        this.studentId = studentId;
        this.details = details;
        date = new Date();
    }

    public int getStudentId() {
        return studentId;
    }

    @NonNull
    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat();
        return dateFormat.format(date)+" ("+DataHandler.studentDetails.get(studentId).getName()+") "+details;
    }
}
