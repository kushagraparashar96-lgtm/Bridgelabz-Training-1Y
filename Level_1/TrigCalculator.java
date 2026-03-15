package Level_1;

public class TrigCalculator {


        public static double[] calculateTrigonometricFunctions(double angle) {
            double radians = Math.toRadians(angle);

            double sinValue = Math.sin(radians);
            double cosValue = Math.cos(radians);
            double tanValue = Math.tan(radians);

            return new double[]{sinValue, cosValue, tanValue};
        }

        public static void main(String[] args) {
            double angleInDegrees = 45.0;

            double[] results = calculateTrigonometricFunctions(angleInDegrees);

            System.out.println("Angle in Degrees: " + angleInDegrees);
            System.out.println("Sine: " + results[0]);
            System.out.println("Cosine: " + results[1]);
            System.out.println("Tangent: " + results[2]);
        }
    }

