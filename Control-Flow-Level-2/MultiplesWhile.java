import java.util.Scanner;
class MultiplesWhile {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a positive integer less than 100: ");
if (input.hasNextInt()) {
int number = input.nextInt();
if (number > 0 && number < 100) {
int counter = 100;
System.out.print("Multiples: ");
while (counter >= 1) {
if (counter % number == 0) {
System.out.print(counter + " ");
}
counter--;
}
} else {
System.out.println("Invalid: Number must be between 1 and 99.");
}
} else {
System.out.println("Invalid: Not an integer.");
}
}
}