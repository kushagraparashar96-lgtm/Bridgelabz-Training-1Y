package Level_3;

import java.util.Scanner;

public class CollinearPoints {

    public static boolean checkCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    public static boolean checkCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return Math.abs(area) == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter coordinates for Point A (x1 y1):");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter coordinates for Point B (x2 y2):");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.println("Enter coordinates for Point C (x3 y3):");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        boolean isCollinearSlope = checkCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        boolean isCollinearArea = checkCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        System.out.println("\n--- Results ---");
        System.out.println("Collinear using Slope Method: " + isCollinearSlope);
        System.out.println("Collinear using Area Method:  " + isCollinearArea);

        if (isCollinearSlope && isCollinearArea) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }

        input.close();
    }
}
