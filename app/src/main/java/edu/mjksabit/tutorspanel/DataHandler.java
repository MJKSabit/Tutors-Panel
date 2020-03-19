package edu.mjksabit.tutorspanel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataHandler {


    public static ArrayList<Student> students = new ArrayList<>();

    public static Map<Integer, Student> studentDetails = new HashMap<>();

    public static ArrayList<Record> records;

    static {
        students.add(new Student(1, "Sifat"));
        students.add(new Student(2, "Sabit"));
        students.add(new Student(3, "Azmal"));
        students.add(new Student(4, "Nabiha"));
        students.add(new Student(5, "Yusha"));
        students.add(new Student(6, "Hamza"));


    }

    public static void main(String[] args) {
        records = new ArrayList<>();
        for (Student stud : students) {
            studentDetails.put(stud.getId(), stud);
        }
    }
}
