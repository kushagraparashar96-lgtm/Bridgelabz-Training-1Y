package Level_3;

public class NumberChecker5 {

    // a. Method to Check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // b. Method to Check if a number is a neon number
    public static boolean isNeon(int n) {
        int square = n * n;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == n;
    }

    // c. Method to Check if a number is a spy number
    public static boolean isSpy(int n) {
        int sum = 0;
        int product = 1;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // d. Method to Check if a number is an automorphic number
    public static boolean isAutomorphic(int n) {
        int square = n * n;
        // Check if square ends with n
        String s1 = Integer.toString(n);
        String s2 = Integer.toString(square);
        return s2.endsWith(s1);
    }

    // e. Method to Check if a number is a buzz number
    public static boolean isBuzz(int n) {
        return (n % 7 == 0) || (n % 10 == 7);
    }

    public static void main(String[] args) {
        int testNum = 1122; // You can change this to test different numbers

        System.out.println("Testing Number: " + testNum);
        System.out.println("-------------------------");
        System.out.println("Is Prime?       : " + isPrime(testNum));
        System.out.println("Is Neon?        : " + isNeon(9)); // 9 is a neon number (9^2=81, 8+1=9)
        System.out.println("Is Spy?         : " + isSpy(1124)); // 1+1+2+4 = 8, 1*1*2*4 = 8
        System.out.println("Is Automorphic? : " + isAutomorphic(25)); // 25^2 = 625 (ends in 25)
        System.out.println("Is Buzz?        : " + isBuzz(testNum));
    }
}
