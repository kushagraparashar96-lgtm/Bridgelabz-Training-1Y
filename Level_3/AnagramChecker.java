package com.gla.Level_3;

import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first text: ");
        String text1 = sc.nextLine();
        System.out.print("Enter the second text: ");
        String text2 = sc.nextLine();

        if (isAnagram(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are NOT anagrams.");
        }

        sc.close();
    }

    public static boolean isAnagram(String t1, String t2) {
        // i. Check if the lengths are equal
        if (t1.length() != t2.length()) {
            return false;
        }

        // ii. Create arrays to store frequency of characters (ASCII)
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // iii. Find the frequency of characters using a loop
        for (int i = 0; i < t1.length(); i++) {
            freq1[t1.charAt(i)]++;
            freq2[t2.charAt(i)]++;
        }

        // iv. Compare the frequency of characters
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }
}