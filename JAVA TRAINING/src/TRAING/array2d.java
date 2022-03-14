package TRAING;
import java.util.Scanner;
public class array2d {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int m,n,i,j;
		System.out.println("Enter value of M");
		m=ob.nextInt();
		System.out.println("Enter value of N");
		n=ob.nextInt();
		int [][]a=new int[m][n];
		System.out.println("Enter array");
		for(i=0;i<m;i++)
			{for(j=0;j<n;j++)
		
		a[i][j]=ob.nextInt();
		}
			// TODO Auto-generated method stub
		for(i=0;i<m;i++)
			{for(j=0;j<n;j++)
		{
		System.out.println(a[i][j]);
		}//
			}
	}

}
