package TRAING;
import java.util.Scanner;
public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b=new Scanner(System.in);
		int a;
		int k=0;

		System.out.print("enter k");
		k=b.nextInt();
try {
	for(int i=0;i<k;i++)
{ a=99/k;
System.out.print(a);
}

	
	}
catch (ArithmeticException e)
{System.out.print("wrong");
}
finally {
	System.out.print("OVER");
}
	}

}
