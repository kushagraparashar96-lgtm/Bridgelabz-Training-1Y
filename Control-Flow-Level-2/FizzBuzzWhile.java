import java.util.Scanner;
class FizzBuzzWhile {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a positive integer: ");
if (input.hasNextInt()) {
int limit = input.nextInt();
if (limit > 0){
int i = 1; 
while (i <= limit){
if (i % 3 == 0 && i % 5 == 0) {
System.out.println("FizzBuzz");
}else if (i % 3 == 0) {
System.out.println("Fizz");
} else if (i % 5 == 0) {
System.out.println("Buzz");
} else {
System.out.println(i);
}
i++; 
}
} else {
System.out.println("Please enter a number greater than 0.");
}
} else {
System.out.println("Invalid input. Please enter an integer.");
}
}
}