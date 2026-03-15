package Level_3;

import java.util.Scanner;

public class CoordinateGeometry {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            // Returning an empty array to represent a vertical line (undefined slope)
            return new double[]{};
        }

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter coordinates for Point 1 (x1 y1):");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter coordinates for Point 2 (x2 y2):");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double dist = calculateDistance(x1, y1, x2, y2);
        double[] lineParams = findLineEquation(x1, y1, x2, y2);

        System.out.println("\n--- Geometry Results ---");
        System.out.printf("Euclidean Distance: %.2f\n", dist);

        if (lineParams.length == 0) {
            System.out.println("Equation of the line: x = " + x1 + " (Vertical Line)");
        } else {
            double m = lineParams[0];
            double b = lineParams[1];
            String sign = (b >= 0) ? "+ " : "- ";
            System.out.printf("Equation of the line: y = %.2fx %s %.2f\n", m, sign, Math.abs(b));
        }

        input.close();
    }
}
