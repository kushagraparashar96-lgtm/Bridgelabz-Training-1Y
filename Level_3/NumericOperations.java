package Level_3;

public class NumericOperations {

    // a. Method to find the count of digits
    public static int getDigitCount(int number) {
        if (number == 0) return 1;
        return String.valueOf(Math.abs(number)).length();
    }

    // a. Method to Store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        int count = getDigitCount(number);
        int[] digits = new int[count];
        int temp = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // b. Method to reverse the digits array
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    // c. Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) return false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) return false;
        }
        return true;
    }

    // d. Method to check if a number is a palindrome using the Digits
    public static boolean isPalindrome(int[] digits) {
        int[] reversedDigits = reverseArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // e. Method to Check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int[] digits) {
        // A duck number has a zero but usually isn't a leading zero
        if (digits.length > 0 && digits[0] == 0) return false;

        for (int digit : digits) {
            if (digit == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int testNum = 7007;
        int[] digits = getDigitsArray(testNum);

        System.out.println("Analyzing Number: " + testNum);
        System.out.println("-------------------------");
        System.out.println("Digit Count: " + getDigitCount(testNum));
        System.out.println("Is Palindrome: " + isPalindrome(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
    }
}
