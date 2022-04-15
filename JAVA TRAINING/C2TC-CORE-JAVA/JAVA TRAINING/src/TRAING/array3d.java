package TRAING;

import java.util.Scanner;

public class array3d {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int m,n,p,i,j,k;
		System.out.println("Enter value of M");
		m=ob.nextInt();
		System.out.println("Enter value of N");
		n=ob.nextInt();
		System.out.println("Enter value of P");
		p=ob.nextInt();
		int [][][]a=new int[m][n][p];
		System.out.println("Enter array");
		for(i=0;i<m;i++)
			{for(j=0;j<n;j++)
			{for(k=0;k<p;k++)
		a[i][j][k]=ob.nextInt();
		}
			}
			// TODO Auto-generated method stub
		for(i=0;i<m;i++)
			{for(j=0;j<n;j++)
		       {for(k=0;k<p;k++)
		{
		System.out.println(a[i][j][k]);
		}
		}	// TODO Auto-generated method stub

	}


}
}
