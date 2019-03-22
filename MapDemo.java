import java.util.*;

public class MapDemo
{
	public static void main(String args[])
	{
		//Hashtable obj=new Hashtable();
		TreeMap obj=new TreeMap();
		//HashMap obj=new HashMap();
		//LinkedHashMap obj=new LinkedHashMap();
		obj.put(11,"Ramesh");
		obj.put(42,"Rakesh");
		obj.put(3,"Rajesh");
		obj.put(444,"Suresh");
		obj.put(55,"Ganesh");

		Set keys=obj.entrySet();
		Iterator i=keys.iterator();
		while(i.hasNext())
		{
			//System.out.println(i.next());
			Map.Entry me=(Map.Entry)i.next();
			System.out.println("EMP ID: "+me.getKey()+" EMP NAME: "+me.getValue());
		}
	}
}