package Level_1;

public class NumberChecker {



        public static int checkNumber(int num) {
            if (num > 0) {
                return 1;
            } else if (num < 0) {
                return -1;
            } else {
                return 0;
            }
        }

        public static void main(String[] args) {

            int inputNumber = -25;

            int result = checkNumber(inputNumber);

            System.out.println("Input Number: " + inputNumber);
            System.out.println("Result code: " + result);


            if (result == 1) {
                System.out.println("The number is Positive.");
            } else if (result == -1) {
                System.out.println("The number is Negative.");
            } else {
                System.out.println("The number is Zero.");
            }
        }
    }

