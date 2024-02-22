package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Spring2023_6b {
	public static void main(String[] args)
	{
		Connection conn=null;
		PreparedStatement pre = null;
		String query1,query2;
		try
		{
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3308/Fall2014","root","");
			query1 = "create table student(id int primary key,Name varchar(225),roll int)";
			pre = conn.prepareStatement(query1);
			query2 = "insert into student (id,Name,roll) values(?,?,?)";
			pre = conn.prepareStatement(query2);
			pre.setInt(1, 11);
			pre.setString(2, "Ram");
			pre.setInt(3, 1);
			pre.setInt(1, 111);
			pre.setString(2, "shyam");
			pre.setInt(3, 2);
			pre.executeUpdate();
		
			
			System.out.println("successfully done");
				
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				pre.close();
				conn.close();
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
	}

		
}
	
