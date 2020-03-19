package edu.mjksabit.tutorspanel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class AddRecord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_record);

        //data.setText(((Student)getIntent().getParcelableExtra("student-id")).getName());
        int id =  Integer.parseInt(getIntent().getStringExtra("id"));
        Student student = DataHandler.studentDetails.get(id);


    }
}
