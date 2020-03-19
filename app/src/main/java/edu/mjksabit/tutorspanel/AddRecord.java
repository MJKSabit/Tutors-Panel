package edu.mjksabit.tutorspanel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddRecord extends AppCompatActivity {

    private Student student;

    public void goBack(View view) {
        super.onBackPressed();
    }

    public void addRecord(View view) {
        EditText details = (EditText) findViewById(R.id.add_record_details);


        DataHandler.records.add(new Record(student.getId(), details.getText().toString()));

        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_record);

        //data.setText(((Student)getIntent().getParcelableExtra("student-id")).getName());
        int id =  Integer.parseInt(getIntent().getStringExtra("id"));
        student = DataHandler.studentDetails.get(id);

        TextView studentName = (TextView) findViewById(R.id.add_record_name);
        studentName.setText(student.getName());

    }
}
