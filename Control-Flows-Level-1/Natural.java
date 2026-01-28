import java.util.Scanner;
class Natural{
public static void main(String args [])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Natural Number:");
int a=sc.nextInt();
int b=0;
if(a>0){
for(int i=0;i<=a;i++){
b+=i;
}
System.out.println("The sum is"+b);
}
}
}
