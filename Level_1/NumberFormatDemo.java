package com.gla.Level_1;

import java.util.Scanner;

public class NumberFormatDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-numeric string (e.g., 'hello'): ");
        String input = sc.nextLine();

        handleNumberFormat(input);

        generateNumberFormat(input);

        sc.close();
    }

    public static void generateNumberFormat(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    public static void handleNumberFormat(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught Exception: The input string is not a valid integer.");
            System.out.println("Error Type: " + e.getClass().getSimpleName());
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException: " + e.getMessage());
        }
    }
}