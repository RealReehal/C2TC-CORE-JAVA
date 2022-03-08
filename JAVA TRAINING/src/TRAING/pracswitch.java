package TRAING;
import java.util.Scanner;
public class pracswitch {

	public static void main(String[] args) {
		
		int a;
		System.out.println("Enter number");
		Scanner obj= new Scanner(System.in);
		a=obj.nextInt();
		int b;
		b=--a;
		switch(a){
			case 10: System.out.println("HIP HOP");
			break;
			case 11: System.out.println("R and B");
			break;
			case 12: System.out.println("TRAP");
			break;
			
			default:System.out.println("POP");
		}
		
	}
}
