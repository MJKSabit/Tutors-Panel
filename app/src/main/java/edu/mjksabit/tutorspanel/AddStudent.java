package edu.mjksabit.tutorspanel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddStudent extends AppCompatActivity {

    public void goBack(View view) {
        setResult(RESULT_CANCELED);
        finish();
    }

    public void addRecord(View view) {
        EditText details = (EditText) findViewById(R.id.add_name);


        DataHandler.addStudent(details.getText().toString());

        setResult(RESULT_OK);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
    }
}
