package TRAING;
import java.util.Scanner;
public class armstrongmun {

	public static void main(String[] args) {
		int r=0;
		//System.out.println("enter number of digits ");
		Scanner aScanner=new Scanner(System.in);
		//int d=aScanner.nextInt();
		int b;
	
	System.out.println("enter 3 digit  number");
	 b=aScanner.nextInt();
	 int l=b;
	 while(b>0){
		
	
	int c=b%10;
	//System.out.println(c);
	 r+=c*c*c;
	//System.out.println(r);
	b=b/10;
	;
	 } 
	//System.out.println(b);// TODO Auto-generated method stub
if(r==l) {
	System.out.println("armstrong  number");
}
else {
	System.out.println("wrong number");
}
	}


}

