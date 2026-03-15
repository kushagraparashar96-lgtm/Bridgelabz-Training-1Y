package com.gla.Level_3;

import java.util.Scanner;

public class UniqueCharFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step A: Get length manually
        int length = getManualLength(input);

        // Step B: Get unique characters
        char[] uniqueChars = findUniqueChars(input, length);

        // Step C: Display result
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        sc.close();
    }

    // Method to find length without .length()
    public static int getManualLength(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method to find unique characters
    public static char[] findUniqueChars(String text, int length) {
        // i. Temporary array to store unique characters
        char[] tempArray = new char[length];
        int uniqueCount = 0;

        // ii. Nested loops using charAt()
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Inner loop: check if character appeared before
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If it never appeared before, add it to our temp array
            if (isUnique) {
                tempArray[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // iii. Create a new array with the exact size of unique characters found
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = tempArray[i];
        }

        return result;
    }
}
