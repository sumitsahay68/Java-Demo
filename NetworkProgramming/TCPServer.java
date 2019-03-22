import java.io.*;
import java.net.*;

public class TCPServer
{
	public static void main(String args[])
	{
		try
		{	
			ServerSocket ss=new ServerSocket(95);
			System.out.println("Server Started....");
			Socket cs=ss.accept(); 
			System.out.println("Connnected To: "+cs);

			BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			String line=null;
			do
			{
				line=br.readLine();
				System.out.println(line);
				
			}
			while(!line.equals("end"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}				
	}
} 