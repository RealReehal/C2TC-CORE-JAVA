package TRAING;

import java.util.Scanner;

public class array1d {

	public static void main(String[] args) {
		int []a=new int[4];
		
		System.out.println(a.getClass());

		Scanner ob=new Scanner(System.in);
		System.out.println("Enter array size");
		int b=ob.nextInt();
		System.out.println("Enter array");
		for(int i=0;i<b;i++)
		{
		a[i]=ob.nextInt();
		}
		for(int i=0;i<b;i++)
		{
		System.out.println(a[i]);
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
