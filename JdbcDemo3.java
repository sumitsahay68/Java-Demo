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
			/*
			Statement stmt=con.createStatement();
			PreparedStatement pstmt=con.prepareStatement("insert into EMP values(?,?)");
			System.out.println("Enter name: ");
			pstmt.setString(1,new Scanner(System.in).nextLine());
			System.out.println("Enter age: ");
			pstmt.setInt(2,new Scanner(System.in).nextInt());
			pstmt.execute();
			*/
			//ResultSet rs=stmt.exexuteQuery("select * from EMP");
			//stmt.executeUpdate("delete from EMP where AGE>30");
			//stmt.executeUpdate("update EMP set AGE=AGE+1");
			/*
			while(rs.next())
			{
				System.out.println("Name: "+rs.getString(1));
				System.out.println("Age: "+rs.getInt(2));
				System.out.println();
			}
			*/
			//connection close
			//rs.close();
			

			//Batch Statement
			Statement stmt=con.createStatement();
			stmt.addBatch("");
			stmt.addBatch("");
			stmt.addBatch("");
			stmt.addBatch("");
			stmt.addBatch("");
			System.out.println("please wait 30sec");
			Thread.sleep(30000);
			stmt.executeBatch();					
			System.out.println("now check table..");
			

			//pstmt.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

											