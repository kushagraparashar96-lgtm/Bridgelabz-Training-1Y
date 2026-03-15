package Level_1;

public class MinMaxFinder {


        public static void findMinMax(int a, int b, int c) {
            int smallest = a;
            if (b < smallest) smallest = b;
            if (c < smallest) smallest = c;

            int largest = a;
            if (b > largest) largest = b;
            if (c > largest) largest = c;

            System.out.println("Numbers: " + a + ", " + b + ", " + c);
            System.out.println("The Smallest number is: " + smallest);
            System.out.println("The Largest number is: " + largest);
        }

        public static void main(String[] args) {
            int n1 = 45;
            int n2 = 12;
            int n3 = 78;

            findMinMax(n1, n2, n3);
        }
    }

