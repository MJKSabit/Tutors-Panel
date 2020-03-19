package edu.mjksabit.tutorspanel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class StudentAdapter extends ArrayAdapter<Student> {

    public StudentAdapter(Context context, ArrayList<Student> students) {
        super(context, 0, students);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Student student = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.student_list_template, parent, false);
        }

        TextView name = (TextView) convertView.findViewById(R.id.student_list_template_name_id);
        name.setText(student.getId()+" "+student.getName());

        Button addRecord = (Button) convertView.findViewById(R.id.student_list_template_button_id);
        addRecord.setTag(student.getId());

        return convertView;
    }
}
