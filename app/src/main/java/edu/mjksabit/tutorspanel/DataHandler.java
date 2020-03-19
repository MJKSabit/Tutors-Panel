package edu.mjksabit.tutorspanel;

import java.util.ArrayList;

public class DataHandler {


    public static ArrayList<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "Sifat"));
        students.add(new Student(2, "Sabit"));
        students.add(new Student(3, "Azmal"));
        students.add(new Student(4, "Nabiha"));
        students.add(new Student(5, "Yusha"));
        students.add(new Student(6, "Hamza"));
    }
}
