package TRAING;
import java.util.Scanner;
public class calculatorswitch {

	public static void main(String[] args) {
		Scanner aScanner=new Scanner(System.in);
		System.out.println("enter first number");
		int b=aScanner.nextInt();
		System.out.println("enter second number");
		int c=aScanner.nextInt();
		System.out.println("enter operator");
		String a=aScanner.next();
		int k=0;
		switch(a)
		{
		case "+" : k=b+c;
		break;// TODO Auto-generated method stub
		case "-" :k= b-c;break;
		case "*" :k=b*c;break;
		case "/" :k=b/c;break;
		default: System.out.println("wrong operator input");
		
		}
		if(k!=0)
System.out.println("result is "+ k);
		else 
			System.out.println("try again");
}
}