 package TRAING;
import java.util.*;
public class customexecption {

	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.print("enter age ");// TODO Auto-generated method stub
int i=a.nextInt();
if (i<18) {throw new Cantvote("cant vote dude");

	}
else {System.out.print("vote ");

}
	}
}
class Cantvote extends RuntimeException

{Cantvote (String msg)
	{
	super(msg);
}

}

	

