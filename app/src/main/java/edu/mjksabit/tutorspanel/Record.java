package edu.mjksabit.tutorspanel;

import androidx.annotation.NonNull;

import java.text.DateFormat;
import java.text.ParseException;
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

    public static Record RecordReader(String time, int id, String det) {
        Record record = new Record(id, det);
        DateFormat dateFormat = new SimpleDateFormat();
        try {
            record.date = dateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return record;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getWriter() {
        DateFormat dateFormat = new SimpleDateFormat();
        return dateFormat.format(date)+", "+studentId+", "+details;
    }

    @NonNull
    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat();
        return dateFormat.format(date)+" ("+DataHandler.studentDetails.get(studentId).getName()+") "+details;
    }
}
