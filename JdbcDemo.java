import java.sql.*;

public class JdbcDemo
{
	public static void main(String args[])
	{
		try
		{
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password-1");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from EMP");
			//stmt.executeUpdate("delete from EMP where AGE>30");
			//stmt.executeUpdate("update EMP set AGE=AGE+1");
			
			while(rs.next())
			{
				System.out.println("Name: "+rs.getString(1));
				System.out.println("Age: "+rs.getInt(2));
				System.out.println();
			}
			
			//connection close
			rs.close();
			stmt.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

											