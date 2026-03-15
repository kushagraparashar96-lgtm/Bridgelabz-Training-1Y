package Level_2;

public class MeasurementConvertor {

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        double val = 5.0;

        System.out.println(val + " yards = " + convertYardsToFeet(val) + " feet");
        System.out.println(val + " feet = " + convertFeetToYards(val) + " yards");
        System.out.println(val + " meters = " + convertMetersToInches(val) + " inches");
        System.out.println(val + " inches = " + convertInchesToMeters(val) + " meters");
        System.out.println(val + " inches = " + convertInchesToCm(val) + " cm");
    }
}
