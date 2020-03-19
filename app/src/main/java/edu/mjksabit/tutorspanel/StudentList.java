package edu.mjksabit.tutorspanel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class StudentList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Sifat"));
        students.add(new Student(2, "Sabit"));
        students.add(new Student(3, "Azmal"));
        students.add(new Student(4, "Nabiha"));
        students.add(new Student(5, "Yusha"));
        students.add(new Student(6, "Hamza"));

        ListView listView = (ListView) findViewById(R.id.student_list);
        listView.setAdapter(new StudentAdapter(this.getBaseContext(), students));

    }
}
