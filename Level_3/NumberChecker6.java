package Level_3;
public class NumberChecker6 {

    // Helper method to find the sum of proper divisors
    private static int sumOfProperDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Helper method to calculate factorial of a digit
    private static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // a. Method to Check if a number is a perfect number
    public static boolean isPerfect(int n) {
        if (n <= 0) return false;
        return sumOfProperDivisors(n) == n;
    }

    // b. Method to Check if a number is an abundant number
    public static boolean isAbundant(int n) {
        if (n <= 0) return false;
        return sumOfProperDivisors(n) > n;
    }

    // c. Method to Check if a number is a deficient number
    public static boolean isDeficient(int n) {
        if (n <= 0) return false;
        return sumOfProperDivisors(n) < n;
    }

    // d. Method to Check if a number is a strong number
    public static boolean isStrong(int n) {
        if (n <= 0) return false;
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int[] testNumbers = {6, 12, 15, 145};

        for (int num : testNumbers) {
            System.out.println("--- Testing Number: " + num + " ---");
            System.out.println("Is Perfect?  : " + isPerfect(num));
            System.out.println("Is Abundant? : " + isAbundant(num));
            System.out.println("Is Deficient?: " + isDeficient(num));
            System.out.println("Is Strong?   : " + isStrong(num));
            System.out.println();
        }
    }
}
