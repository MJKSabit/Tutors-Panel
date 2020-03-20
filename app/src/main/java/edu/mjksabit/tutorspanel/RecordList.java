package edu.mjksabit.tutorspanel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RecordList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_record_list);

        ArrayAdapter<Record> adapter = new ArrayAdapter<>(getBaseContext(), android.R.layout.simple_list_item_1,
                DataHandler.records);

        ((ListView) findViewById(R.id.record_list)).setAdapter(adapter);
    }
}
