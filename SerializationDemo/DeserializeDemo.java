import java.io.*;
import java.util.*;

public class DeserializeDemo
{
	public static void main(String args[])
	{
		try
		{
			
			ObjectInputStream oos=new ObjectInputStream(new FileInputStream("emp.ser"));
			ArrayList a=(ArrayList)oos.readObject();
			Iterator i=a.iterator();
			while(i.hasNext())		
				System.out.println(i.next());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			
			