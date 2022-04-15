package TRAING;
import java.util.Scanner;

public class labelledblockbreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x ;
System.out.println("enter a number");
Scanner obj=new Scanner(System.in);
x=obj.nextInt();
l: //labeled block
{ System.out.println("NO STOPPING");
x++;

if(x==10)
	break l;
System.out.println("YOU ONLIVE TWICE");
}
System.out.print("YOLO");
	}

}
