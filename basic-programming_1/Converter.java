import java.util.Scanner;	
class Converter
{
public static void main(String args [])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter kilometer");
int a=sc.nextInt();
int miles=a*1.6;
System.out.println("miles are:-"+miles);
}
}