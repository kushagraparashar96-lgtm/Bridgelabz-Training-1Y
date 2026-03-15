package com.gla.Level_1;

import java.util.Scanner;

class IllegalArgumentDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string (at least 5 characters): ");
        String input = sc.nextLine();

        handleIllegalArgument(input);

        generateIllegalArgument(input);

        sc.close();
    }

    public static void generateIllegalArgument(String text) {
        String result = text.substring(4, 2);
        System.out.println("Substring: " + result);
    }

    public static void handleIllegalArgument(String text) {
        try {
            String result = text.substring(3, 1);
            System.out.println("Substring: " + result);
        } catch (StringIndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("Caught Exception: Invalid index range (start > end).");
            System.out.println("Error Type: " + e.getClass().getSimpleName());
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException: " + e.getMessage());
        }
    }
}