package com.gla.level_2;

  import java.util.Random;

    public class VotingEligibility {

        public static int[] generateAges(int n) {

            Random r = new Random();
            int[] ages = new int[n];

            for (int i = 0; i < n; i++) {
                ages[i] = 10 + r.nextInt(90);
            }

            return ages;
        }

        public static String[][] checkVoting(int[] ages) {

            String[][] result = new String[ages.length][2];

            for (int i = 0; i < ages.length; i++) {

                int age = ages[i];
                boolean canVote = false;

                if (age >= 0) {
                    if (age >= 18) {
                        canVote = true;
                    }
                }

                result[i][0] = String.valueOf(age);
                result[i][1] = String.valueOf(canVote);
            }

            return result;
        }

        public static void display(String[][] data) {

            System.out.println("Age\tCanVote");

            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i][0] + "\t" + data[i][1]);
            }
        }

        public static void main(String[] args) {

            int[] ages = generateAges(10);

            String[][] result = checkVoting(ages);

            display(result);
        }
    }

