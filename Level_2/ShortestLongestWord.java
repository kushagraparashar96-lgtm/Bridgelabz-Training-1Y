package com.gla.level_2;

    import java.util.Scanner;

    public class ShortestLongestWord {

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

        public static int[] findShortestLongest(String[][] data) {

            int shortest = Integer.parseInt(data[0][1]);
            int longest = Integer.parseInt(data[0][1]);

            int shortIndex = 0;
            int longIndex = 0;

            for (int i = 1; i < data.length; i++) {

                int len = Integer.parseInt(data[i][1]);

                if (len < shortest) {
                    shortest = len;
                    shortIndex = i;
                }

                if (len > longest) {
                    longest = len;
                    longIndex = i;
                }
            }

            return new int[]{shortIndex, longIndex};
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a sentence:");
            String text = sc.nextLine();

            String[] words = splitWords(text);

            String[][] table = wordAndLength(words);

            int[] result = findShortestLongest(table);

            System.out.println("Shortest word: " + table[result[0]][0]);
            System.out.println("Longest word: " + table[result[1]][0]);
        }
    }

