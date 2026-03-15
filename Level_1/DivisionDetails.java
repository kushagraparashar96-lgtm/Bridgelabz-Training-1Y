package Level_1;

public class DivisionDetails{


        public static int[] findRemainderAndQuotient(int number, int divisor) {
            int quotient = number / divisor;
            int remainder = number % divisor;

            return new int[]{quotient, remainder};
        }

        public static void main(String[] args) {
            int num = 25;
            int div = 4;

            int[] results = findRemainderAndQuotient(num, div);

            System.out.println("Number: " + num);
            System.out.println("Divisor: " + div);
            System.out.println("The Quotient is: " + results[0]);
            System.out.println("The Remainder is: " + results[1]);
        }
    }

