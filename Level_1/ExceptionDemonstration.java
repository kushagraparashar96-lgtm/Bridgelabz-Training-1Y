package com.gla.Level_1;

import java.util.Scanner;

public class ExceptionDemonstration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("\n--- Part 1: Handling the Exception ---");
        handleException(input);

        System.out.println("\n--- Part 2: Generating Unhandled Exception ---");
        System.out.println("The program will now crash...");
        generateException(input);

        System.out.println("This line will never be printed.");
        sc.close();
    }

    // b. Method to generate the Exception (Unhandled)
    public static void generateException(String text) {
        // Accessing an index equal to length (which is out of bounds)
        char outOfBounds = text.charAt(text.length());
        System.out.println("Character found: " + outOfBounds);
    }

    // c. Method to handle the Exception using try-catch
    public static void handleException(String text) {
        try {
            // Attempting to access an index significantly beyond the length
            char outOfBounds = text.charAt(100);
            System.out.println("Character found: " + outOfBounds);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: You tried to access an index that doesn't exist!");
            System.out.println("Error Message: " + e.getMessage());
        }
    }
}