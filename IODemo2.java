import java.io.*;

public class IODemo2
{
	public static void main(String args[])
	{
		try
		{
			/*
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
			System.out.print("enter file name: ");
			String fname=br.readLine();
			
			File file=new File(fname);
			if(file.exists())
			{*/	/*	
				RandomAccessFile raf=new RandomAccessFile("abc.txt","rw");	
				
				//raf.seek(3);
				//System.out.println(raf.readLine());
				raf.seek(raf.length()); //for appending
				raf.writeBytes("DEMO :D :p :o");

				raf.close();
				
				PrintWriter pw=new PrintWriter(System.out);
				PrintWriter pw=new PrintWriter(new FileOutputStream("abc.txt",true) //true means appending enabled
				pw.println("Hello EVEeeeeerybodyyyy");
				pw.flush();

				pw.close();
				*/
					
				File dir1=new File("abc");
				dir1.mkdir();
				File dir2=new File(dir1,"zzy");
				dir2.mkdir();
				File f=new File(dir2,"atoz.txt");
				f.createNewFile();

				PrintWriter pw=new PrintWriter(new FileOutputStream(f,true));
				pw.println(args[0]);
				pw.flush();
			
				pw.close();
			/*
			}
			else
				System.out.print("FILE DOES NOT EXIST!!");		*/
		}
		catch(Exception e)
		{	
			System.out.println(e);
		}
	}
}