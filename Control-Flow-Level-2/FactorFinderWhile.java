import java.util.Scanner;
 class FactorFinderWhile{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a positive integer: ");
if (input.hasNextInt()) {
int number = input.nextInt();
if (number > 0) {
int i = 1;
System.out.print("Factors: ");
while (i <= number) {
if (number % i == 0) {
System.out.print(i + " ");
}
i++;
}
} else {
System.out.println("Invalid: Number must be positive.");
}
} else {
System.out.println("Invalid: Not an integer.");
}
}
}