import java.util.Scanner;
class combination
{
public static void main(String args [])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of student:");
int n=sc.nextInt();
int combination=(n*(n-1))/2;
System.out.println("possible handshake:"+combination);
}
}