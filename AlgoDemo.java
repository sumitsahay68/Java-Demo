import java.util.*;

public class AlgoDemo
{
	public static void main(String atr[])
	{
		LinkedList<Object> list=new LinkedList<>();
		
		list.add("6af396sfa9");
		list.add("15af369");
		list.add("6faa39");
		list.add("1af1fa69");
		list.add("6fa239faf6a9faf3a69");
		list.add("22af56fa539fa1");
		
		//Collections.reverse(list);
		//Collections.shuffle(list);
		//Collections.swap(list,2,5);	
		
		for(Object x:list)
			System.out.println(x);
	}
}