import java.util.Scanner;
class Bonuscalculator{
public static void main(String args []){
Scanner sc=new Scanner(System.in);
System.out.println("enter salary:");
double salary=sc.nextDouble();
System.out.println("Enter years");
double years=sc.nextDouble();
if(years>5){
double bonus=salary*0.05;
System.out.println("Eligible for bonus:"+bonus);
}
else{
System.out.println("Not Eligible for bonus:");
}
}
}


