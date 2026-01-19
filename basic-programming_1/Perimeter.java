import java.util.Scanner;
class Perimeter
{
public static void main(String args [])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of L");
int L=sc.nextInt();
System.out.println("Enter the value of B");
int B=sc.nextInt();
int p=*(L+B);
System.out.println("perimeter of rectangle:"+p);
}
}
