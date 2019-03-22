class A implements Cloneable
{
	int x;
	public A clone()
	{
		try
		{
			return (A)super.clone();
		}
		catch(Exception e)
		{}
		return null;
		
	}
	
	public String toString()
	{
		return "The object is of class A having x= "+x;
	}

	public void finalize()
	{
		System.out.println("Object with value of x: "+x+" is removed......");
	}
		
}

public class ObjectDemo
{

public static void main(String args[]) throws Exception
{
	A a1=new A();
	A a2=new A();
	a1.x=10;
	a2.x=50;
	System.out.println(a1.equals(a2));
		
	A a3=a1.clone();
	
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);

	a3.x=100;
	//a3.finalize();s
	a1=null;
	a2=null;
	a3=null;

	System.gc(); //or Runtime.gc();
	Thread.sleep(2000);
}
}
	