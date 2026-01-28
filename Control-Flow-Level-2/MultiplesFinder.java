import java.util.Scanner;
class MultiplesFinder {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a positive integer less than 100: ");
if (input.hasNextInt()) {
int number = input.nextInt();
if (number >0&&number<100) {
System.out.println("Multiples of " + number + " below 100 (counting down):");
for (int i = 100; i >= 1; i--) {
if (i % number == 0) {
System.out.print(i + " ");
}
}
} else {
System.out.println("Invalid: Number must be between 1 and 99.");
}
}else{
System.out.println("Invalid: Not an integer.");
}
}
}