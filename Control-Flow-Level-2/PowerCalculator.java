import java.util.Scanner;
class PowerCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the base number: ");
int number = input.nextInt();
System.out.print("Enter the power (exponent): ");
int power = input.nextInt();
if (number >= 0 && power >= 0) {
long result = 1;
for (int i = 1; i <= power; i++) {
result *= number;
}
System.out.println(number + " raised to the power of " + power + " is: " + result);
}else {
System.out.println("Invalid input: Please enter positive integers.");
}
}
}