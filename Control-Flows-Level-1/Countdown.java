import java.util.Scanner;
class Countdown{
public static void main(String args [])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Countdown value");
int count=sc.nextInt();
while(count>=0){
System.out.println(count);
count--;
}

System.out.println("Blasting off!");
}
}