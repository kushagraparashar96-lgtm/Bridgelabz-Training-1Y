package Level_1;

public class HandshakeCalculator {




        public static int calculateHandshakes(int n) {
            return (n * (n - 1)) / 2;
        }

        public static void main(String[] args) {

            int numberOfStudents = 10;


            int totalHandshakes = calculateHandshakes(numberOfStudents);

            System.out.println("For " + numberOfStudents + " students:");
            System.out.println("The maximum number of possible handshakes is: " + totalHandshakes);
        }
    }

