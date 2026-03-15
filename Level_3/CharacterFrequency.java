package com.gla.Level_3;

import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step A: Call method to get the frequency table
        String[][] frequencyTable = getFrequencyArray(input);

        // Step B: Display the result
        System.out.println("\nCharacter Frequency:");
        System.out.println("---------------------");
        for (int i = 0; i < frequencyTable.length; i++) {
            System.out.println("'" + frequencyTable[i][0] + "' : " + frequencyTable[i][1]);
        }

        sc.close();
    }

    public static String[][] getFrequencyArray(String text) {
        // i. Create frequency array for 256 ASCII characters
        int[] counts = new int[256];

        // ii. Loop through text to find the frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            counts[c]++;
        }

        // Count how many unique characters exist to size our 2D array
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (counts[i] > 0) {
                uniqueCount++;
            }
        }

        // iii. Create a 2D array to store characters and their frequencies
        // Column 0: Character (as String), Column 1: Frequency (as String)
        String[][] result = new String[uniqueCount][2];

        // iv. Loop through the original text and store unique entries
        int row = 0;
        // We use a boolean array to ensure we don't add the same char to the 2D array twice
        boolean[] processed = new boolean[256];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!processed[c]) {
                result[row][0] = String.valueOf(c);
                result[row][1] = String.valueOf(counts[c]);
                processed[c] = true;
                row++;
            }
        }

        return result;
    }
}

