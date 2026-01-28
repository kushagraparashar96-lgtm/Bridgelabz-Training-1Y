import java.util.Scanner;
class Spring{
public static void main(String args [])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter month name:");
int a=sc.nextInt();
System.out.println("Enter date:");
int b=sc.nextInt();
if(a==3){
if(b>=20&&b<=31){
System.out.println("Spring Season");
}
}
else if(a==4&&b<=30){
System.out.println("Spring season");
}
else if(a==5&&b<=31){
System.out.println("Spring season");
}
else if(a==6&&b<=20){
System.out.println("Spring season");
}
else{
System.out.println("Not a spring season");
}
}
}




