class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=20;i++)
		 System.out.println("i: "+i);
		try
		{
			if(i%3==0)
				Thread.sleep(2000);
		}
		catch(Exception e){}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=20;i++)
		 System.out.println("j: "+i);
		try
		{
			if(i%4==0)
				Thread.sleep(2000);
		}
		catch(Exception e){}
	}
}
class C extends Thread
{
	public void run()
	{
		for(int i=1;i<=20;i++)
		 System.out.println("k: "+i);
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e){}
	}
}
public class ThreadDemo
{
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
		C c=new C();	
		
		a.start();
		b.start();
		c.start();

		a.setPriority(7);	
		b.setName("abc");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		Thread m1=Thread.currentThread();
		System.out.println(m1);
		/*for(int i=1;i<=200;i++)
		{
			System.out.print(i+" ");
			if(i==30)
				b.suspend();
			if(i==150)
				b.resume();
			if(i==30)
				a.suspend();
			m1.sleep(200);
		}*/
		b1.join();	

		System.out.println("a is alive: "+a.isAlive());
		System.out.println("b is alive: "+b.isAlive());
		System.out.println("c is alive: "+c.isAlive());
		System.out.println("HELLO");
	}
}