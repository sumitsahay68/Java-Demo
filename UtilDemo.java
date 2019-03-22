import java.util.*;

public class UtilDemo
{
	public static void main(String args[])
	{
		Date d1=new Date();
		System.out.println(d1);
		Date d2=new Date();
		d2.setTime(-4485354);
		System.out.println(d2);
		
		d1.setMonth(45);
		System.out.println(d1);
		
		System.out.println(d1.after(d2));
		System.out.println(d1.before(d2));
		System.out.println(d1.equals(d2));
		
		System.out.println("---------------------");
		
		String str="Raju|25|20000|raju@gmail.com;Blore,Karnataka:8946565555";
		StringTokenizer st=new StringTokenizer(str,"|;:");
		int count=st.countTokens();
		for(int i=0;i<count;i++)
		{
			System.out.println(st.nextToken());
		}

		System.out.println("---------------------");

		Stack s=new Stack();
		s.push("111");
		s.push("222");
		s.push("333");
		s.push("444");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());

		System.out.println(s.search("111"));
		System.out.println(s.search("222"));
		System.out.println(s.empty());
		
	}
} 