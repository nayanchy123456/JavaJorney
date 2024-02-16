  
import java.sql.*;

public class DBConnection 
{
	public static void main(String []args)
	{
		Connection con = null;
		PreparedStatement pre=null;
		String Query;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con =  DriverManager.getConnection("jdbc:mysql://localhost:3307/TestDB","root","");
			 Query = "INSERT INTO DEMOTABLE (Id,Name,Faculty) VALUES (?,?,?)";
			 pre = con.prepareStatement(Query);
			 pre.setInt(1, 1);
			 pre.setString(2,"Nayan");
			 pre.setString(3,"BEit");
			 pre.execute();
			 
		}
		catch(Exception ex)
		{
			System.out.println(ex);
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
				System.out.println(ex);
			}
		}
		
	}
}
