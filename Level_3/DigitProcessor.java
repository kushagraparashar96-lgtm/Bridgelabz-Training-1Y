package Level_3;
public class DigitProcessor {

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

    public static int calculateSum(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static double calculateSumOfSquares(int[] digits) {
        double sumSq = 0;
        for (int digit : digits) {
            sumSq += Math.pow(digit, 2);
        }
        return sumSq;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = calculateSum(digits);
        if (sum == 0) return false;
        return (number % sum == 0);
    }

    public static int[][] findDigitFrequency(int[] digits) {
        int[] counts = new int[10];
        int uniqueDigits = 0;

        for (int d : digits) {
            if (counts[d] == 0) uniqueDigits++;
            counts[d]++;
        }

        int[][] frequencyTable = new int[uniqueDigits][2];
        int row = 0;
        for (int i = 0; i < 10; i++) {
            if (counts[i] > 0) {
                frequencyTable[row][0] = i;
                frequencyTable[row][1] = counts[i];
                row++;
            }
        }
        return frequencyTable;
    }

    public static void main(String[] args) {
        int inputNumber = 2112;
        int[] digits = getDigitsArray(inputNumber);

        System.out.println("Original Number: " + inputNumber);
        System.out.println("Digit Count: " + getDigitCount(inputNumber));
        System.out.println("Sum of Digits: " + calculateSum(digits));
        System.out.println("Sum of Squares: " + calculateSumOfSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshadNumber(inputNumber, digits));

        System.out.println("\nDigit Frequency Table:");
        int[][] freqTable = findDigitFrequency(digits);
        System.out.println("Digit | Frequency");
        System.out.println("---------------");
        for (int i = 0; i < freqTable.length; i++) {
            System.out.println("  " + freqTable[i][0] + "   |    " + freqTable[i][1]);
        }
    }
}
