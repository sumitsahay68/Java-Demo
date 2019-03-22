import java.sql.*;

public class JdbcDemo
{
	public static void main(String args[])
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","","");
			con.setAutoCommit(false);
			PreparedStatement pstmt=con.prepareStatement("insert into EMP values(?,?)");
			for(int i=1;i<=10;i++)
			{
				System.out.println("\nEnter Name: ");
				String name=br.readLine();
				System.out.print("Enter age: ");
				int age=Integer.parseInt(br.readLine());
				
				pstmt.setString(1,name);
				pstmt.setInt(2,age);
				pstmt.execute();	
				
				if(i==5)
					con.rollback();		
				if(i==10)
					con.commit();
			}
				
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

											