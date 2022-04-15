package TRAING;
import java.util.*;
public class charat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner aScanner=new Scanner(System.in);
String s;
System.out.println("ENTER STRING");
s=aScanner.next();
char x;
System.out.println("enter char to serch");
x=aScanner.next().charAt(0);
System.out.println(s.charAt(3));
int c=0;
System.out.println(s.length());
for( int i=0;i<s.length();i++)
{ if(s.charAt(i)==x)
{c++;

}

	}
System.out.print("char exits in string "+ c +" times");
}
}
