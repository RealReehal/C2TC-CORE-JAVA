package TRAING;
import java.util.Scanner;
public class righttriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner aScanner=new Scanner(System.in);
int i,j;
System.out.println("enter rows");
int r=aScanner.nextInt();
for(i=0;i<r;i++)
{for(j=0;j<=i;j++)
	System.out.print("*");
System.out.println(" ");
}
	}

}
