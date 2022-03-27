package TRAING;
import java.util.Scanner;
public class lefttriangle {

	public static void main(String[] args) {
	Scanner jScanner =new Scanner(System.in);
	System.out.println("enter rows");// TODO Auto-generated method stub
	int k=jScanner.nextInt();
	int a,b;

	 for (a = 0; a < k; a++) {
		  
         // nested 2nd loop
        // for (b = 2 * (k - a); b >= 0; b--) {
             // printing spaces
             System.out.print(" ");
      //   }

         // nested 3rd loop
         for (b = 0; b <= a; b++) {
             // printing stars
             System.out.print("* ");
         }

         // end-line
         System.out.println();
     }
 }
	}

