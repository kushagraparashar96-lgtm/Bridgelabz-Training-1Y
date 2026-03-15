package Level_2;

public class Convertor {

    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        double f = 98.6;
        double c = 37.0;
        double lbs = 150.0;
        double kgs = 68.0;
        double gal = 5.0;
        double ltr = 20.0;

        System.out.println(f + " F = " + convertFarhenheitToCelsius(f) + " C");
        System.out.println(c + " C = " + convertCelsiusToFarhenheit(c) + " F");
        System.out.println(lbs + " lbs = " + convertPoundsToKilograms(lbs) + " kg");
        System.out.println(kgs + " kg = " + convertKilogramsToPounds(kgs) + " lbs");
        System.out.println(gal + " gallons = " + convertGallonsToLiters(gal) + " liters");
        System.out.println(ltr + " liters = " + convertLitersToGallons(ltr) + " gallons");
    }
}
