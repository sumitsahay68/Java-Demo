import java.util.*;

public class CollectionDemo2
{
	public static void main(String args[])
	{
		//HashSet obj=new HashSet();
		TreeSet obj=new TreeSet();
		obj.add("111");
		obj.add("222");
		obj.add("333");
		obj.add("444");
		obj.add("555");
		obj.add("111");
		
		Iterator i=obj.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}	
	}
}