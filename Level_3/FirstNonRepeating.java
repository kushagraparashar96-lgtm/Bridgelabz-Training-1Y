package com.gla.Level_3;

import java.util.Scanner;

public class FirstNonRepeating {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step B: Call method to find the first non-repeating character
        char result = findFirstNonRepeating(input);

        // Step C: Display result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }

    // Method to find the first non-repeating character
    public static char findFirstNonRepeating(String text) {
        // i. Create frequency array for 256 ASCII characters
        int[] frequency = new int[256];

        // ii. First pass: Loop through text to count occurrences
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            frequency[c]++; // Uses the ASCII value of 'c' as the index
        }

        // iii. Second pass: Loop through text again to find the first char with frequency 1
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (frequency[c] == 1) {
                return c; // Found the first one!
            }
        }

        // Return a null character if no unique character exists
        return '\0';
    }
}
