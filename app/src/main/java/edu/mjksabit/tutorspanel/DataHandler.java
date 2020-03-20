package edu.mjksabit.tutorspanel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataHandler {

    public static int student_id = 0;

    public static ArrayList<Student> students = new ArrayList<>();

    public static Map<Integer, Student> studentDetails = new HashMap<>();

    public static ArrayList<Record> records = new ArrayList<>();

    public static void addStudent(String studentName) {
        student_id++;
        Student student = new Student(student_id, studentName);
        students.add(student);
        studentDetails.put(student_id, student);
        FileHandler.writeStudent(student);
    }

    public static void main(String[] args) {

        for (Student stud : students) {
            studentDetails.put(stud.getId(), stud);
        }
    }
}
