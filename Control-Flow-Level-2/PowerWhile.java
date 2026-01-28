import java.util.Scanner;
class PowerWhile {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the base number: ");
int number = input.nextInt();
System.out.print("Enter the power (exponent): ");
int power = input.nextInt();
long result = 1;
int counter = 0;
while (counter < power) {
result *= number;
counter++;
}
System.out.println("Result: " + result);
}
}