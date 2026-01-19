import java.util.Scanner;
class Assignmentoperator
{
public static void main(String args [])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter  value");
int a=sc.nextInt();
int b=sc.nextInt();
a+=10;
System.out.println("+="+a);
a-=5;
System.out.println("-="+a);
a/=10;
System.out.println("/="+a);
}
}