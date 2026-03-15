package Level_1;

public class SpringSeason {


        public static boolean isSpring(int month, int day) {
            if (month == 3 && day >= 20 && day <= 31) {
                return true;
            } else if (month == 4 && day >= 1 && day <= 30) {
                return true;
            } else if (month == 5 && day >= 1 && day <= 31) {
                return true;
            } else if (month == 6 && day >= 1 && day <= 20) {
                return true;
            }
            return false;
        }

        public static void main(String[] args) {
            int month = 4;
            int day = 15;

            boolean result = isSpring(month, day);

            if (result) {
                System.out.println("Its a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
        }
    }

