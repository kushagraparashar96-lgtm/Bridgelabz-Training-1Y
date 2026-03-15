package com.gla.level_2;
import java.util.Scanner;

public class StringLengthWithoutMethod {

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count); // character access
                count++;
            }
        }
        catch (Exception e) {
            // exception aate hi loop stop
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        int result = findLength(text);

        System.out.println("Length using user method: " + result);
        System.out.println("Length using built-in method: " + text.length());
    }
}
