package edu.mjksabit.tutorspanel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class StudentList extends AppCompatActivity {

    public void plusOnclick(View view) {
//        Log.d(view.getTag().toString(),  DataHandler.studentDetails.get((int) view.getTag()).getName());
        Intent intent = new Intent(StudentList.this, AddRecord.class);
        intent.putExtra("id", ""+DataHandler.studentDetails.get((int) view.getTag()).getId());
        startActivity(intent);
    }

    public void addNewStudent(View view) {
        //
    }

    public void goBack(View view) {
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DataHandler.main(null);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);



        ListView listView = (ListView) findViewById(R.id.student_list);
        listView.setAdapter(new StudentAdapter(this.getBaseContext(), DataHandler.students));

    }
}
