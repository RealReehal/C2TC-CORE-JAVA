package TRAING;
import java.util.Scanner;
public class whileloops {

	public static void main(String[] args) {
		System.out.println("ENTER DIGIT");
		Scanner ob=new Scanner(System.in);
		int a=ob.nextInt();
	
		while(a<=10)
		{ 
			System.out.println("WE RAN UP ");
			a++;
		}
		do	{System.out.println("WE WALK DOWN");
		a++; }while(a<4);
	}

}
