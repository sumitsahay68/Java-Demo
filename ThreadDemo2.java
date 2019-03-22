class Abc implements Runnable
{	
	public void run() //throws Exception
	{
		synchronized(this)
		{
			for(int i=1;i<=20;i++)
			{
				System.out.println(Thread.currentThread().getName()+": "+i);
				try{
				Thread.sleep(500);
				}catch(Exception e){}
			}
		}
	}
}
	
public class ThreadDemo2
{
	public static void main(String args[])
	{
		Abc a1=new Abc();
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a1);
		Thread t3=new Thread(a1);
		t1.setName("a");
		t1.setName("b");
		t1.setName("c");
		t1.start();		
		t2.start();
		t3.start();
	}
}