import java.io.*;
import java.net.*;

public class ChatA
{
	public static void main(String args[])
	{
		try
		{
			byte[] data=new byte[1024];
			byte[] recData=new byte[1024];
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			//InetAddress ia=InetAddress.getByName("10.249.34.188"); 
			InetAddress ia=InetAddress.getLocalHost(); 
			DatagramSocket ds=new DatagramSocket(1094);
			DatagramPacket dp=null;
			DatagramPacket drec=new DatagramPacket(recData,recData.length);

			System.out.println("Enter Name: ");
			String uname=br.readLine();
			String msg=null;
			String recMsg=null;
			do
			{
				ds.receive(drec);
				recMsg=new String(drec.getData(),0,drec.getLength());
				if(recMsg!=null)
					System.out.println(recMsg);

				System.out.println("You: ");
				msg=br.readLine();
				data = msg.getBytes();
				dp=new DatagramPacket(data,data.length,ia,1093);
				ds.send(dp);
			}
			while(!msg.equals("quit"));

			ds.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}				
	}
} 