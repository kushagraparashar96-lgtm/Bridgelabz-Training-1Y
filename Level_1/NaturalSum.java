package Level_1;

public class NaturalSum {


        public static int calculateSum(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        }

        public static void main(String[] args) {
            int n = 10;

            int result = calculateSum(n);

            System.out.println("The sum of the first " + n + " natural numbers is: " + result);
        }
    }

