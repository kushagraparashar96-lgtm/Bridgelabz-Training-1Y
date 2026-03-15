package com.school.data;


public class Student {
    public String name;
    public double math, science, english;

    public Student(String name, double math, double science, double english) {
        this.name = name;
        this.math = math;
        this.science = science;
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student: " + name +
                "\nMarks: [Math: " + math + ", Science: " + science + ", English: " + english + "]";
    }
}