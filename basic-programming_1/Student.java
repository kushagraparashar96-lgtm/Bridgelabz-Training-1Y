import java.util.Scanner;
class Student
{
public static void main(String args [])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of pens:");
int a=sc.nextInt();
System.out.println("enter number of student:-");
int b=sc.nextInt();
int qoutient=a/b;
int remainder=a%b;
System.out.println("qoutient:"+qoutient);
System.out.println("remainder:"+remainder);
}
}