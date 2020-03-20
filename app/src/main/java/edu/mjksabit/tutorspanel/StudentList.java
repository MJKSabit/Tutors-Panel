package edu.mjksabit.tutorspanel;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class StudentList extends AppCompatActivity {

    private static ListView listView;
    private static Context baseContext;

    public void plusOnclick(View view) {
//        Log.d(view.getTag().toString(),  DataHandler.studentDetails.get((int) view.getTag()).getName());
        Intent intent = new Intent(StudentList.this, AddRecord.class);
        intent.putExtra("id", ""+DataHandler.studentDetails.get((int) view.getTag()).getId());
        startActivity(intent);
    }

    public void addNewStudent(View view) {
        Intent intent = new Intent(StudentList.this, AddStudent.class);
        startActivity(intent);
    }

    public void goBack(View view) {

        super.onBackPressed();
    }

    public static void showList() {
        listView.setAdapter(new StudentAdapter(baseContext, DataHandler.students));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        listView = (ListView) findViewById(R.id.student_list);
        baseContext = this.getBaseContext();

        showList();

    }
}
