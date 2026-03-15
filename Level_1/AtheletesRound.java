package Level_1;

public class AtheletesRound {


        public static double calculateRounds(double s1, double s2, double s3) {
            double perimeter = s1 + s2 + s3;
            double targetDistance = 5000.0;

            return targetDistance / perimeter;
        }

        public static void main(String[] args) {
            // Predefined side lengths in meters
            double side1 = 150.0;
            double side2 = 200.0;
            double side3 = 250.0;

            // Calling the method
            double roundsNeeded = calculateRounds(side1, side2, side3);

            // Displaying the result
            System.out.println("Park Sides: " + side1 + "m, " + side2 + "m, " + side3 + "m");
            System.out.println("The perimeter of the park is: " + (side1 + side2 + side3) + " meters.");
            System.out.println("To complete a 5 km run, the athlete must complete: " + roundsNeeded + " rounds.");
        }
    }

