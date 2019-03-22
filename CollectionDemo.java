import java.util.*;

public class CollectionDemo
{
	public static void main(String args[])
	{
		Vector v1=new Vector(2);
		
		v1.add("HELLO");
		v1.add(new Date());
		v1.add(324323);
		v1.add(new Thread());
		v1.add("THANKS");

		Enumeration e=v1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}