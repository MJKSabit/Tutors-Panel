package edu.mjksabit.tutorspanel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FileHandler.context = this.getBaseContext();

    }

    public void showStudentList(View v) {
        Intent intent = new Intent(MainActivity.this, StudentList.class);
        startActivity(intent);
    }

    public void showRecordList(View v) {
        Intent intent = new Intent(MainActivity.this, RecordList.class);
        startActivity(intent);
    }

    public void showVisualizer(View v) {
        Intent intent = new Intent(MainActivity.this, Visualizer.class);
        startActivity(intent);
    }

}
