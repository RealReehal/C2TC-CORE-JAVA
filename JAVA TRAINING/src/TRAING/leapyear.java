package TRAING;
import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
		Scanner bScanner= new Scanner(System.in);
		System.out.println("enter year");
		int a=bScanner.nextInt();
		if(a%4==0)
		{System.out.println("LEAR YEAR");// TODO Auto-generated method stub

	}
		else {
			System.out.println("NOT LEAP YEAR");
		}
}
}
