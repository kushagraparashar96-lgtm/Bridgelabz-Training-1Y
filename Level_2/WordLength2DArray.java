package com.gla.level_2;

    import java.util.Scanner;

    public class WordLength2DArray {

        public static int findLength(String str) {
            int count = 0;
            try {
                while (true) {
                    str.charAt(count);
                    count++;
                }
            } catch (Exception e) {
            }
            return count;
        }

        public static String[] splitWords(String text) {

            int len = findLength(text);
            int wordCount = 1;

            for (int i = 0; i < len; i++) {
                if (text.charAt(i) == ' ') {
                    wordCount++;
                }
            }

            String[] words = new String[wordCount];

            int start = 0;
            int index = 0;

            for (int i = 0; i < len; i++) {
                if (text.charAt(i) == ' ') {
                    words[index++] = text.substring(start, i);
                    start = i + 1;
                }
            }

            words[index] = text.substring(start, len);

            return words;
        }

        public static String[][] wordAndLength(String[] words) {

            String[][] result = new String[words.length][2];

            for (int i = 0; i < words.length; i++) {
                result[i][0] = words[i];
                result[i][1] = String.valueOf(findLength(words[i]));
            }

            return result;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a sentence:");
            String text = sc.nextLine();

            String[] words = splitWords(text);

            String[][] table = wordAndLength(words);

            System.out.println("\nWord\tLength");

            for (int i = 0; i < table.length; i++) {
                int length = Integer.parseInt(table[i][1]);
                System.out.println(table[i][0] + "\t" + length);
            }
        }
    }

