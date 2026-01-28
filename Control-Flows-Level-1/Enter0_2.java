import java.util.Scanner;
class Enter0_2{
public static void main(String args [])
{
Scanner sc=new Scanner(System.in);
double num;
double sum=0.0;
while(true){
System.out.println("Enter number (0 or negative to stop)");
num=sc.nextDouble();
if(num<=0){
break;
}
else{
sum+=num;
}
System.out.println("total sum is :"+sum);
}
}
}
