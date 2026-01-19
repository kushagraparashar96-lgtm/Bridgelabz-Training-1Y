import java,.util.Scanner;
class Profit
{
public static void main(String args [])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the cost price:");
int a=sc.nextInt();
System.out.println("enter the selling price:");
int b=sc.nextInt();
int profit=b-a;
int profitprct=profit*100/a;
System.out.println("profit is:"+profit);
System.out.println("profit percent is : +profitprct);
}
}  