import java.io.*;
import java.net.*;

public class TCPClient
{
	public static void main(String args[])
	{
		try
		{
			BufferedReader br=new 	BufferedReader(new InputStreamReader(System.in));	
			InetAddress ia = InetAddress.getLocalHost();
			Socket cs = new Socket(ia,95);  //request for connection

			PrintWriter out = new PrintWriter(cs.getOutputStream());
			System.out.println("Enter Data to be sent :- ");
			String line = null;
			do
			{
				line = br.readLine();
				//line = line +"\n";
				out.println(line);
				out.flush();
			}
			while(!line.equals("end"));

			out.close();
			br.close();
			cs.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}				
	}
} 