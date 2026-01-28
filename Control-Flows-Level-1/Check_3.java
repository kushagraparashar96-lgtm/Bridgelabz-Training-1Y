import java.util.Scanner;
class Check_3
{
public static void main(String args [])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter 1st no.");
int a=sc.nextInt();
System.out.println("Enter 2nd no.");
int b=sc.nextInt();
System.out.println("Enter 3rd no.");
int c=sc.nextInt();
if(a>b&&a>c){
System.out.println("A is greatest");
}
else if(b>a&&b>c){
System.out.println("B is greatest");
}
else{
System.out.println("C is greatest");
}
}
}