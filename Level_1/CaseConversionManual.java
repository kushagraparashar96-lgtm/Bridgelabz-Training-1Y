package com.gla.Level_1;

import java.util.Scanner;

public class CaseConversionManual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String input = sc.nextLine();

        // b. Convert using manual logic
        String manualUpper = convertToUpperCaseManual(input);

        // d. Convert using built-in method
        String builtInUpper = input.toUpperCase();

        // c & d. Compare and display
        boolean areSame = compareStrings(manualUpper, builtInUpper);

        System.out.println("\nManual Conversion: " + manualUpper);
        System.out.println("Built-in Conversion: " + builtInUpper);
        System.out.println("Are the results identical? " + areSame);

        sc.close();
    }

    // b. Manual Uppercase conversion using ASCII difference
    public static String convertToUpperCaseManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // Check if character is between 'a' (97) and 'z' (122)
            if (c >= 'a' && c <= 'z') {
                // Subtract 32 to move from lowercase to uppercase
                result += (char) (c - 32);
            } else {
                result += c;
            }
        }
        return result;
    }

    // c. Compare two strings manually using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
