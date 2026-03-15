package Level_2;

import java.util.Scanner;

public class FriendStats {

    public static int findYoungest(int[] ages) {
        int youngest = ages[0];
        for (int age : ages) {
            if (age < youngest) {
                youngest = age;
            }
        }
        return youngest;
    }

    public static double findTallest(double[] heights) {
        double tallest = heights[0];
        for (double height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");
            System.out.print("Age: ");
            ages[i] = input.nextInt();
            System.out.print("Height: ");
            heights[i] = input.nextDouble();
        }

        int youngestAge = findYoungest(ages);
        double tallestHeight = findTallest(heights);

        System.out.println("\n--- Results ---");
        System.out.println("The age of the youngest friend is: " + youngestAge);
        System.out.println("The height of the tallest friend is: " + tallestHeight);

        input.close();
    }
}
