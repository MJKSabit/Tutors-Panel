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

        TextView data = (TextView) findViewById(R.id.add_record_data);
        data.setText("Nope");
        //data.setText(((Student)getIntent().getParcelableExtra("student-id")).getName());
        Log.d("Hello -> ", getIntent().getStringExtra("id"));
    }
}
