package Level_2;

import java.util.Scanner;
public class FactorAnylasis {


        public static int[] findFactors(int number) {
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }

            int[] factors = new int[count];
            int index = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    factors[index++] = i;
                }
            }
            return factors;
        }

        public static int calculateSum(int[] factors) {
            int sum = 0;
            for (int factor : factors) {
                sum += factor;
            }
            return sum;
        }

        public static long calculateProduct(int[] factors) {
            long product = 1;
            for (int factor : factors) {
                product *= factor;
            }
            return product;
        }

        public static double calculateSumOfSquares(int[] factors) {
            double sumSq = 0;
            for (int factor : factors) {
                sumSq += Math.pow(factor, 2);
            }
            return sumSq;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            int[] factorsArray = findFactors(num);

            System.out.print("Factors: ");
            for (int f : factorsArray) {
                System.out.print(f + " ");
            }

            System.out.println("\nSum of factors: " + calculateSum(factorsArray));
            System.out.println("Product of factors: " + calculateProduct(factorsArray));
            System.out.println("Sum of squares of factors: " + calculateSumOfSquares(factorsArray));

            input.close();
        }
    }

