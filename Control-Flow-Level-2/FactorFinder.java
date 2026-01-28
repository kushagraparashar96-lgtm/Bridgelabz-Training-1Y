import java.util.Scanner;

class FactorFinder {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a positive integer: ");
if (input.hasNextInt()) {
int number = input.nextInt();
if (number > 0) {
System.out.print("Factors: ");
for (int i = 1; i <= number; i++) {
if (number % i == 0) {
System.out.print(i + " ");
}
}
} else {
System.out.println("Invalid: Number must be positive.");
}
} else {
System.out.println("Invalid: Not an integer.");
}
}
}