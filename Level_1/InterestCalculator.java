package Level_1;

public class InterestCalculator {



        // Method to calculate simple interest
        public static double calculateSI(double principal, double rate, double time) {
            return (principal * rate * time) / 100;
        }

        public static void main(String[] args) {
            // Hardcoded values (No Scanner needed)
            double p = 100.0;
            double r = 5;
            double t = 6;

            // Calling the method
            double si = calculateSI(p, r, t);

            // Outputting the result exactly as requested
            System.out.println("The Simple Interest is " + si +
                    " for Principal " + p +
                    ", Rate of Interest " + r +
                    " and Time " + t);
        }
    }

