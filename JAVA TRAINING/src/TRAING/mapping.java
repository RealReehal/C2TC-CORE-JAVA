package TRAING;
import java.io.ObjectInputStream.GetField;
import java.util.*;

public class mapping {

	public static void main(String[] args) {
	HashMap<String,Integer> map=new HashMap<>();
	// TODO Auto-generated method stub
	System.out.println("enter size");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println("enter string");
	for(int i=0;i<n;i++)
	{ String k=s.next();
map.put(k, i);
	}
System.out.println("size of map "+map.size());
System.out.println(map);
int a=0;
if (map.containsKey("how"))
{ a=map.get("how");
	}
System.out.println(a);
try { int b=map.get("brother");
System.out.println(b);
}
catch (ArithmeticException e) {
	System.out.println("exception thrown"+e);// TODO: handle exception
}

finally {
	System.out.println("");
}

}
}
