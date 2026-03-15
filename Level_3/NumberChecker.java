package Level_3;

public class NumberChecker {

    public static int getDigitCount(int number) {
        if (number == 0) return 1;
        return String.valueOf(Math.abs(number)).length();
    }

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

    public static boolean isDuckNumber(int[] digits) {
        if (digits.length > 0 && digits[0] == 0) {
            return false;
        }
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int[] digits) {
        int n = digits.length;
        double sum = 0;
        int originalNumber = 0;

        for (int i = 0; i < n; i++) {
            sum += Math.pow(digits[i], n);
            originalNumber = originalNumber * 10 + digits[i];
        }
        return (int) sum == originalNumber;
    }

    public static void findLargestAndSecondLargest(int[] digits) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > first) {
                second = first;
                first = digit;
            } else if (digit > second && digit != first) {
                second = digit;
            }
        }
        System.out.println("Largest: " + first + ", Second Largest: " +
                (second == Integer.MIN_VALUE ? "None" : second));
    }

    public static void findSmallestAndSecondSmallest(int[] digits) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < first) {
                second = first;
                first = digit;
            } else if (digit < second && digit != first) {
                second = digit;
            }
        }
        System.out.println("Smallest: " + first + ", Second Smallest: " +
                (second == Integer.MAX_VALUE ? "None" : second));
    }

    public static void main(String[] args) {
        int num = 153;
        int[] digits = getDigitsArray(num);

        System.out.println("Number: " + num);
        System.out.println("Digit Count: " + getDigitCount(num));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(digits));

        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
    }
}
