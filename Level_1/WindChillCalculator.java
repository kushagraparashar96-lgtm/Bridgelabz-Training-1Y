package Level_1;

public class WindChillCalculator {


        public static double calculateWindChill(double temperature, double windSpeed) {
            double windChill = 35.74 + (0.6215 * temperature) +
                    (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
            return windChill;
        }

        public static void main(String[] args) {
            double temp = 40.0;
            double speed = 15.0;

            double result = calculateWindChill(temp, speed);

            System.out.println("Temperature: " + temp + " F");
            System.out.println("Wind Speed: " + speed + " mph");
            System.out.println("The Wind Chill Temperature is: " + result);
        }
    }

