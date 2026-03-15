package com.gla.Level_3;
import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        // Clean the input (optional: remove spaces and make lowercase for better checking)
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();
        int len = cleanInput.length();

        System.out.println("\n--- Palindrome Check Results ---");

        // Logic 1: Iterative
        System.out.println("Logic 1 (Iterative): " + isPalindromeIterative(cleanInput));

        // Logic 2: Recursive
        System.out.println("Logic 2 (Recursive): " + isPalindromeRecursive(cleanInput, 0, len - 1));

        // Logic 3: Reversal
        System.out.println("Logic 3 (Reversal): " + isPalindromeReversal(cleanInput));

        sc.close();
    }

    // Logic 1: Iterative Comparison
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive Comparison
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // i. Base case: all characters compared
        if (start >= end) {
            return true;
        }
        // ii. Check mismatch
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        // iii. Recursive call
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Reversal Comparison
    public static boolean isPalindromeReversal(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper for Logic 3: Reverse a string manually
    public static char[] reverseString(String text) {
        int len = text.length();
        char[] revArray = new char[len];
        for (int i = 0; i < len; i++) {
            revArray[i] = text.charAt(len - 1 - i);
        }
        return revArray;
    }
}

