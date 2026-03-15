package Level_1;

public class ChocolateDistribution {



        public static int[] findRemainderAndQuotient(int number, int divisor) {
            int quotient = number / divisor;
            int remainder = number % divisor;
            return new int[]{quotient, remainder};
        }

        public static void main(String[] args) {
            int numberOfChocolates = 23;
            int numberOfChildren = 5;

            int[] results = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            System.out.println("Total Chocolates: " + numberOfChocolates);
            System.out.println("Total Children: " + numberOfChildren);
            System.out.println("Each child gets: " + results[0]);
            System.out.println("Remaining chocolates: " + results[1]);
        }
    }

