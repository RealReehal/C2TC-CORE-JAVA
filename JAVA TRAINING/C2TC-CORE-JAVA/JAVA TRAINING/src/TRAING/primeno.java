package TRAING;
import java.util.Scanner;
public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner aScanner=new Scanner(System.in);
System.out.println("enter number");
int a=aScanner.nextInt();
if(a==1) {
	System.out.println("1 is not prime or composite");
}
else if (a==2||a==3||a==5||a==5||a==7||a==11) {
	System.out.println("prime number");
}
else if (a%2==0||a%3==0||a%5==0||a%7==0||a%11==0) {
	System.out.println("not prime");
} 	else {
	System.out.println(" prime number");
}
	}
}
