package com.gla.Level_3;
import java.util.Scanner;

class FrequencyByUniqueChars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step B: Get the 2D frequency array
        String[][] resultTable = getFrequencyWithUnique(input);

        // Step C: Display results
        System.out.println("\nCharacter Frequency Analysis:");
        System.out.println("-----------------------------");
        for (int i = 0; i < resultTable.length; i++) {
            System.out.println("'" + resultTable[i][0] + "' appears " + resultTable[i][1] + " time(s)");
        }

        sc.close();
    }

    // Hint a: Method to find unique characters using nested loops
    public static char[] uniqueCharacters(String text) {
        int n = text.length();
        char[] temp = new char[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            char current = text.charAt(i);
            boolean alreadyExists = false;

            // Nested loop to check previous characters
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    alreadyExists = true;
                    break;
                }
            }

            if (!alreadyExists) {
                temp[count++] = current;
            }
        }

        // Trim to exact size
        char[] unique = new char[count];
        for (int i = 0; i < count; i++) {
            unique[i] = temp[i];
        }
        return unique;
    }

    // Hint b: Method to build the 2D frequency array
    public static String[][] getFrequencyWithUnique(String text) {
        // i & ii: Find frequency using ASCII indexes
        int[] freqMap = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freqMap[text.charAt(i)]++;
        }

        // iii: Call uniqueCharacters() to get the list of chars
        char[] uniqueChars = uniqueCharacters(text);

        // iv: Create 2D String array (Rows = number of unique chars, Cols = 2)
        String[][] finalTable = new String[uniqueChars.length][2];

        // v: Map unique characters to their frequencies from the freqMap
        for (int i = 0; i < uniqueChars.length; i++) {
            char c = uniqueChars[i];
            finalTable[i][0] = String.valueOf(c);    // Store character
            finalTable[i][1] = String.valueOf(freqMap[c]); // Store frequency
        }

        return finalTable;
    }
}
