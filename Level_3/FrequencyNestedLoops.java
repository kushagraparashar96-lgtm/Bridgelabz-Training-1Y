package com.gla.Level_3;
import java.util.Scanner;

public class FrequencyNestedLoops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step A: Call the method to get frequencies
        String[] result = getFrequencyNested(input);

        // Step B: Display the result
        System.out.println("\nCharacter Frequency (Nested Loop Logic):");
        System.out.println("----------------------------------------");
        for (String entry : result) {
            System.out.println(entry);
        }

        sc.close();
    }

    public static String[] getFrequencyNested(String text) {
        // i. Convert text to char array and create a matching frequency array
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        int uniqueCount = 0;

        // ii. Nested loops to find frequency
        for (int i = 0; i < chars.length; i++) {
            // If the character is '0', it means we already counted it as a duplicate
            if (chars[i] == '0') {
                continue;
            }

            freq[i] = 1; // Initialize frequency to 1
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;    // Increment count
                    chars[j] = '0'; // Set duplicate to '0' to avoid re-counting
                }
            }
            uniqueCount++; // Keep track of how many non-'0' characters we have
        }

        // iii. Create a 1D String array for the final results
        String[] finalResults = new String[uniqueCount];
        int index = 0;

        // Re-iterate through the modified chars array to pull out non-'0' entries
        // Note: The original chars array was modified in step ii
        char[] originalCharsForReference = text.toCharArray();

        // We use the original string to get the characters, but skip where freq is 0
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                finalResults[index] = "'" + chars[i] + "' : " + freq[i];
                index++;
            }
        }

        return finalResults;
    }
}
