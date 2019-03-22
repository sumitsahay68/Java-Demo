import java.io.*;

public class IODemo
{
	public static void main(String args[])
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
			System.out.print("enter file name: ");
			String fname=br.readLine();
			
			File file=new File(fname);
			if(file.exists())
			{		
				BufferedReader fr=new BufferedReader(new FileReader(fname));	
				String line = null;
				while((line=fr.readLine())!=null)
				{
					System.out.println(line);
				}
				fr.close();
			}
			else
				System.out.print("FILE DOES NOT EXIST!!");		
			/*System.out.print("Enter age: ");
			int age=Integer.parseInt(br.readLine());
			
			System.out.println("--------------------------");
			System.out.println(name+" "+age);*/
		}
		catch(Exception e)
		{	
			System.out.println(e);
		}
	}
}