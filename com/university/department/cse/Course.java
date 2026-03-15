package com.university.department.cse;



public class Course {
    private String courseName;
    private String courseCode;

    public Course(String name, String code) {
        this.courseName = name;
        this.courseCode = code;
    }

    public void displayCourse() {
        System.out.println("Course Details:");
        System.out.println("Name: " + courseName);
        System.out.println("Code: " + courseCode);
    }
}