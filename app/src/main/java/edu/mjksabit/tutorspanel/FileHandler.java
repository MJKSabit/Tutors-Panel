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

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput(studentFileName, Context.MODE_APPEND));
            outputStreamWriter.write(s.getId()+", "+s.getName()+"\n");
            outputStreamWriter.close();
        }
        catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
    }

    public static void writeRecord(Record record) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput(recordFileName, Context.MODE_APPEND));
            outputStreamWriter.write(record.getWriter()+"\n");
            outputStreamWriter.close();
        }
        catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
    }

    public static ArrayList<Student> readStudentsAll() {

        ArrayList<Student> list = new ArrayList<>();

        try {
            InputStream inputStream = context.openFileInput(studentFileName);

            if ( inputStream != null ) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString = "";

                while ( (receiveString = bufferedReader.readLine()) != null ) {
                    String[] data = receiveString.split(", ");
                    if(data.length!=2) break;
                    list.add(new Student(Integer.parseInt(data[0]), data[1]));
                }

                inputStream.close();
            }
        }
        catch (FileNotFoundException e) {
            Log.e("login activity", "File not found: " + e.toString());
        } catch (IOException e) {
            Log.e("login activity", "Can not read file: " + e.toString());
        }

        DataHandler.student_id = list.size();

        return list;
    }

    public static ArrayList<Record> readRecordsAll() {

        ArrayList<Record> list = new ArrayList<>();

        try {
            InputStream inputStream = context.openFileInput(recordFileName);

            if ( inputStream != null ) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString = "";

                while ( (receiveString = bufferedReader.readLine()) != null ) {
                    String[] data = receiveString.split(", ");
                    if(data.length!=3) break;
                    list.add(Record.RecordReader(data[0], Integer.parseInt(data[1]), data[2]));
                }

                inputStream.close();
            }
        }
        catch (FileNotFoundException e) {
            Log.e("login activity", "File not found: " + e.toString());
        } catch (IOException e) {
            Log.e("login activity", "Can not read file: " + e.toString());
        }

        return list;
    }
}
