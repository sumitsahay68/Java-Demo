import java.io.*;
import java.net.*;

public class UDPReceiver2
{
	public static void main(String args[])
	{
		try
		{
			byte[] data=new byte[1024];
			//byte[] sendData=new byte[1024];
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			DatagramSocket ds=new DatagramSocket(1097);
			DatagramPacket dp=new DatagramPacket(data,data.length);
			//DatagramPacket dp2=null;
			
			String line =  null;
			//String msg=null;
			do
			{
				ds.receive(dp);
				line = new String(dp.getData(),0,dp.getLength());
				System.out.println(line);
				
				//msg=br.readLine();
				//sendData=msg.getBytes();
				//dp2=new DatagramPacket(sendData,sendData.length,ia,1095);
			}
			while(!line.equals("quit"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}				
	}
} 	