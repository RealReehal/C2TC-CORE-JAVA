package TRAING;
import java.util.Scanner;
public class loops {

	public static void main(String[] args) {
		int []x= {5,6,7};// TODO Auto-generated method stub

		System.out.println("Enter vlaue for a");
		Scanner ob=new Scanner(System.in);
		int a=ob.nextInt();
	
		System.out.println("Enter vlaue for b");
		
		Scanner obi=new Scanner(System.in);
		int b=obi.nextInt();
    int c=a+b;
 
     switch (c%2) {
    	 case 0:
    		 for (int x2:x)
    		  System.out.println(x2);
    		 break;
    	 case 1:
    		 for(int i=0;i<3;i++)
    		  System.out.println(x[i]);
    		 break;
    		 default:
    			 System.out.println("WRONG");
     }
	
	}

}
