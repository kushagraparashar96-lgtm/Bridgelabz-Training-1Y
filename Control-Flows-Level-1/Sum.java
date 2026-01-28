import java.util.Scanner;
class Sum{
public static void main(String args [])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a positive integer:");
int n=sc.nextInt();
if(n<=0){
System.out.println("Error:please enter a natural number:");
}
else{
int loopsum=0;
int i=1;}
while (i<=n){
loopsum+=i;
i++;
}
int formulasum=n*(n+1)/2;
System.out.println("sum using while loop:"+loopsum);
System.oout.println("sum using formula:"+formulasum);
if(loopsum==formulasum){
System.out.println("Sucess both computation are correct and match:");
System.out.println("Warning there is a disprency in calculation:");
}
}
}
