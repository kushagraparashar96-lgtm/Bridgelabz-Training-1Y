import java.util.Scanner;
class Height
{
public static void main(String args [])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter height in cm:");
int a=sc.nextInt();
double inches=0.3937*a;
double foot=0.084*inches;
System.out.println("Height in inches:"+inches"h);
System.out.println("Height in feet:"+foot);
}
}