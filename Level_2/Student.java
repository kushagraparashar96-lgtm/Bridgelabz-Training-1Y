package Level_2;

import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    public void displayReport() {
        System.out.println("\n--- Student Report Card ---");
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Marks       : " + marks);
        System.out.println("Grade       : " + calculateGrade());
        System.out.println("---------------------------");
    }
}

class Runner
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = scanner.nextInt();

        System.out.print("Enter Marks (0-100): ");
        double marks = scanner.nextDouble();

        if (marks >= 0 && marks <= 100) {
            Student student = new Student(name, roll, marks);
            student.displayReport();
        } else {
            System.out.println("Error: Invalid marks entered.");
        }

        scanner.close();
    }
}