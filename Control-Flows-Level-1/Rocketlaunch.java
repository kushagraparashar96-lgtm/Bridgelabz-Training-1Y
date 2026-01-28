import java.util.Scanner;
class Rocketlaunch{
public static void main(String args [])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter  countdown value");
int a=sc.nextInt();
for( int i=a;i>=1;i--){
System.out.println("countdown is started"+i);
}
}
}

