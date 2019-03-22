public class LangDemo
{
	public static void main(String ar[])
	{
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.sqrt(25));
		System.out.println(Math.cbrt(25));
	 	System.out.println(Math.ceil(3.05));
		System.out.println(Math.floor(4.99));
		System.out.println(Math.round(3.8));
		int ran=(int)(Math.random()*100);
		System.out.println(ran);
		
		System.out.println("---------------------");

		String str="Hello Everyone";
		System.out.println(str.length());
		System.out.println(str.replace('e','*'));
		System.out.println(str.indexOf('e'));
		System.out.println(str.lastIndexOf('e'));
		System.out.println(str.charAt(0));

		System.out.println("------------------------");
		String s1="hello";
		s1=s1.toUpperCase();
		System.out.println(s1);

		StringBuffer sb1=new StringBuffer("Hello");
		sb1.append("HI");
		System.out.println(sb1);

		String str1="Hello";
		String str2="Hello";

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		StringBuffer sb2=new StringBuffer("Hello");
		StringBuffer sb3=new StringBuffer("Hello");
		

		System.out.println(sb2.hashCode());
		System.out.println(sb3.hashCode());

		System.out.println("------------------------");
		
		int a=100;
		Integer i=new Integer(a);	
		System.out.println(i.toBinaryString(i));
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);

		//float pi=3.142;  //invalid
		float pi=3.142F; //or f
		double pa=3.142;

		System.out.println(pi+" "+pa);	

		
	}
}