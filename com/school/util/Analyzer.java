package com.school.util;


import com.school.data.Student;

public class Analyzer {
    public static double calculateAverage(Student s) {
        return (s.math + s.science + s.english) / 3.0;
    }

    public static String findGrade(double average) {
        if (average >= 90) return "A+";
        else if (average >= 80) return "A";
        else if (average >= 70) return "B";
        else if (average >= 60) return "C";
        else return "D/Fail";
    }
}
