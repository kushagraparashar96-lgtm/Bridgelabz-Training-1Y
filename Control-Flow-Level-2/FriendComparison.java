import java.util.Scanner;
public class FriendComparison{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Amar's age and height (e.g., 25 175.5):");
int ageAmar = sc.nextInt();
double heightAmar = sc.nextDouble();
System.out.println("Enter Akbar's age and height:");
int ageAkbar = sc.nextInt();
double heightAkbar = sc.nextDouble();
System.out.println("Enter Anthony's age and height:");
int ageAnthony = sc.nextInt();
double heightAnthony = sc.nextDouble();
String youngest;
if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
youngest = "Amar";
} else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
youngest = "Akbar";
} else {
youngest = "Anthony";
}
String tallest;
if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
tallest = "Amar";
} else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
tallest = "Akbar";
} else {
tallest = "Anthony";
}
System.out.println("\n--- Results ---");
System.out.println("The youngest friend is: " + youngest);
System.out.println("The tallest friend is: " + tallest);
}
}