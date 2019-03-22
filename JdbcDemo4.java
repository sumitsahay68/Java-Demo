import java.sql.*;
import java.io.*;

public class JdbcDemo4
{
	public static void main(String args[])
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password-1");

			//Statement stmt=con.createStatement();			
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);

			System.out.println("Enter table name: ");
			String table=br.readLine();
			ResultSet rs=stmt.executeQuery("select * from "+table);
			ResultSetMetaData rsmd=rs.getMetaData();
			
			int cols=rsmd.getColumnCount();
			while(rs.next())
			{
				for(int i=1;i<=cols;i++)
				{
					System.out.println(rsmd.getColumnName(i)+" : "+rs.getString(i));
				}
				System.out.println();
			}
			while(rs.previous())
			{
				for(int i=1;i<=cols;i++)
				{
					System.out.println(rsmd.getColumnName(i)+" : "+rs.getString(i));
				}
				System.out.println();
			}
			rs.absolute(2);
			for(int i=1;i<=cols;i++)
				{
					System.out.println(rsmd.getColumnName(i)+" : "+rs.getString(i));
				}
				System.out.println();

			rs.relative(-1);
				for(int i=1;i<=cols;i++)
				{
					System.out.println(rsmd.getColumnName(i)+" : "+rs.getString(i));
				}
				System.out.println();


			
			//connection close
			rs.close();
			stmt.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

											