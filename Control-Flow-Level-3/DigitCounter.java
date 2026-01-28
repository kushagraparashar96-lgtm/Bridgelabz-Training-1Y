import java.util.Scanner;
class DigitCounter {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter an integer: ");
int number = input.nextInt();
int temp = Math.abs(number);
int count = 0;
if (temp == 0) {
count = 1;
}else {
while (temp != 0) {
temp = temp / 10;
count++;
}
}
System.out.println("Number of digits: " + count);
}
}