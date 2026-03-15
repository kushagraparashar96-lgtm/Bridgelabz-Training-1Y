package com.gla.level_2;
    import java.util.Scanner;

    public class TrimSpacesProgram {

        public static int[] findTrimIndexes(String text) {

            int start = 0;
            int end = 0;

            int length = 0;
            try {
                while (true) {
                    text.charAt(length);
                    length++;
                }
            } catch (Exception e) {
            }

            start = 0;
            while (start < length && text.charAt(start) == ' ') {
                start++;
            }

            end = length - 1;
            while (end >= 0 && text.charAt(end) == ' ') {
                end--;
            }

            return new int[]{start, end};
        }

        public static String createSubstring(String text, int start, int end) {

            String result = "";

            for (int i = start; i <= end; i++) {
                result = result + text.charAt(i);
            }

            return result;
        }

        public static boolean compareStrings(String a, String b) {

            int len1 = 0;
            int len2 = 0;

            try {
                while (true) {
                    a.charAt(len1);
                    len1++;
                }
            } catch (Exception e) {
            }

            try {
                while (true) {
                    b.charAt(len2);
                    len2++;
                }
            } catch (Exception e) {
            }

            if (len1 != len2) {
                return false;
            }

            for (int i = 0; i < len1; i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string:");
            String text = sc.nextLine();

            int[] indexes = findTrimIndexes(text);

            String trimmed = createSubstring(text, indexes[0], indexes[1]);

            String builtInTrim = text.trim();

            boolean result = compareStrings(trimmed, builtInTrim);

            System.out.println("Custom Trim Result: " + trimmed);
            System.out.println("Built-in Trim Result: " + builtInTrim);
            System.out.println("Both results same: " + result);
        }
    }

