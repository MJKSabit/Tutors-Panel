package edu.mjksabit.tutorspanel;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class FileHandler {
    private static String studentFileName = "student.txt";
    private static String recordFileName = "records.txt";
    public static Context context;

    public static void writeStudent(Student s) {
        try {

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput(studentFileName, Context.MODE_PRIVATE));
            outputStreamWriter.write(s.getId()+", "+s.getName()+"\n");
            outputStreamWriter.close();
        }
        catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
    }

    private static Student readStudent() {

        Student ret = null;

        try {
            InputStream inputStream = context.openFileInput(studentFileName);

            if ( inputStream != null ) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString = "";

                while ( (receiveString = bufferedReader.readLine()) != null ) {
                    String[] data = receiveString.split(", ");
                    ret = new Student(Integer.parseInt(data[0]), data[1]);
                }

                inputStream.close();
            }
        }
        catch (FileNotFoundException e) {
            Log.e("login activity", "File not found: " + e.toString());
        } catch (IOException e) {
            Log.e("login activity", "Can not read file: " + e.toString());
        }

        return ret;
    }

    public static void readStudentAll() {
        Student student;
        DataHandler.students.clear();

        while ( (student = readStudent()) != null ) {
            DataHandler.students.add(student);
            DataHandler.studentDetails.put(student.getId(), student);
        }

        DataHandler.student_id = DataHandler.students.size();
    }
}
