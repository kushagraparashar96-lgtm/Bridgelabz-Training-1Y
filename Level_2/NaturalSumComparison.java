package Level_2;

import java.util.Scanner;

    public class NaturalSumComparison {

        public static int sumRecursion(int n) {
            if (n <= 1) {
                return n;
            }
            return n + sumRecursion(n - 1);
        }

        public static int sumFormula(int n) {
            return (n * (n + 1)) / 2;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = input.nextInt();

            if (n < 1) {
                System.out.println("The number is not a natural number.");
            } else {
                int recursiveResult = sumRecursion(n);
                int formulaResult = sumFormula(n);

                System.out.println("Sum using Recursion: " + recursiveResult);
                System.out.println("Sum using Formula: " + formulaResult);

                if (recursiveResult == formulaResult) {
                    System.out.println("Both results are equal and correct!");
                } else {
                    System.out.println("Results do not match.");
                }
            }
            input.close();
        }
    }

