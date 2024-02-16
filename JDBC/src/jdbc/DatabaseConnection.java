
package jdbc;

import java.sql.*;

public class DatabaseConnection 
{
	public static void main(String []args)
	{
		Connection con = null;
		PreparedStatement pre=null;
		String Query;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con =  DriverManager.getConnection("jdbc:mysql://localhost/TestDB","root","");
			 Query = "INSERT INTO DEMOTABLE (Id,Name,Faculty) VALUES (?,?,?)";
			 pre = con.prepareStatement(Query);
			 pre.setInt(1, 1);
			 pre.setString(2,"Nayan");
			 pre.setString(3,"BEIt");
			 pre.execute();
			 
		}
		catch(Exception ex)
		{
			System.out.println("Database connection error "+ex.getMessage());
		}
		finally
		{
			try
			{
				pre.close();
				con.close();
			}
			catch(Exception ex)
			{
				System.out.println("Connection cannot be closed"+ex.getMessage());
			}
		}
		
	}
}
