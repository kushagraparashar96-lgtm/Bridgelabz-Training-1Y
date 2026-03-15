package Level_1;
import java.util.Scanner;

class Circle {
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate Area
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate Circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display results
    public void displayResults() {
        System.out.println("--- Circle Properties ---");
        System.out.println("Radius        : " + radius);
        System.out.printf("Area          : %.2f\n", calculateArea());
        System.out.printf("Circumference : %.2f\n", calculateCircumference());
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        // Example: Circle with radius 5
        Circle myCircle = new Circle(5.0);
        myCircle.displayResults();
    }
}
