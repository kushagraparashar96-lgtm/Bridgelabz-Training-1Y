import java.util.Scanner;
class discount
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter fee");
int fee=sc.nextInt();
System.out.println("Enter discount percent:");
int d=sc.nextInt();
int discount=fee*d/100;
int pay=fee-discount;
System.out.println("fee:"+discount);
system.out.println("pay:"+pay);
}
}