package practice;
import java.util.Scanner;

public class sumprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int []a=new int[4];// program to find index of array whos elements sum is equal to target
  Scanner b=new Scanner(System.in);
  int i;
  System.out.println("ENter target sum");
  int t=b.nextInt();

  System.out.println("ENter array size");
  int k=b.nextInt();
  System.out.println("ENter array ");
  for(i=0;i<k;i++)
  {a[i]=b.nextInt();
	}
  for(i=0;i<k;i++)
  {if(a[i]+a[i+1]==t)
  {  System.out.print(i+" ");
  System.out.print(i+1);
  }
  
	  
	}
	}
	
}
