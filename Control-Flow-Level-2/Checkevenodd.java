import java.util.Scanner;
class Checkevenodd{
public static void main(String args [])
{
Scanner sc=new Scanner(System.in);
int sum=0;
System.out.println("Enter the number ");
int a=sc.nextInt();
for(int i=1;i<=a;i++) {
if(i%2==0){
System.out.println("EVEN");
}
else{
System.out.println("ODD");
}
}
}
}


