package com.gla.Level_1;

import java.util.Scanner;

public class ArrayIndexDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many names do you want to enter? ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Following the hint: Call the method to handle first,
        // then the one that generates the crash.
        handleArrayIndexException(names);

        generateArrayIndexException(names);

        sc.close();
    }

    public static void generateArrayIndexException(String[] names) {
        // Accessing an index equal to the length (illegal because arrays are 0-indexed)
        String name = names[names.length];
        System.out.println("Name at index: " + name);
    }

    public static void handleArrayIndexException(String[] names) {
        try {
            // Accessing an index clearly outside the bounds
            String name = names[100];
            System.out.println("Name at index: " + name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nCaught Exception: The index provided is outside the array range.");
            System.out.println("Error Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException: " + e.getMessage());
        }
    }
}
