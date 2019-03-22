import java.io.*;
public class Person implements Serializable
{
	String name;
	transient int age;



	public Person()
	{}
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public String toString()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		return "";
	}
}