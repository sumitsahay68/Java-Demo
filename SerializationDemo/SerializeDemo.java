import java.io.*;
import java.util.*;

public class SerializeDemo
{
	public static void main(String args[])
	{
		try
		{
			
			ArrayList obj=new ArrayList();

			obj.add(new Person("Ram",25));
			obj.add(new Person("Kam",25));
			obj.add(new Person("Bam",25));
			obj.add(new Person("Tam",25));
			obj.add(new Person("Nam",25));
			
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("emp.ser"));
			oos.writeObject(obj);

			System.out.println("Successfully Serialized....");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			
			