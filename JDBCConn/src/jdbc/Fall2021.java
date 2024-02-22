package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Fall2021 {
	public static void main(String[] args)
	{
		Connection conn = null;
		PreparedStatement pre = null;
		String query1, query2;
		Scanner sc = new Scanner(System.in);
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/Spring2014","root","");
			
			query1 = "create table Students (id int primary key, name varchar(225), address varchar(225))";
			pre = conn.prepareStatement(query1);
			
			
			 
			String choice = "y";
			while(choice.equalsIgnoreCase("y"))
			{
				System.out.println("Enter your id");
				int id = sc.nextInt();
				
				System.out.println("Enter your name:");
				String name = sc.nextLine();
				
				System.out.println("Enter your address:");
				String address = sc.nextLine();
				
				query2 = " insert into Students (id,name,address) values (?,?,?)";
				pre = conn.prepareStatement(query2);
				pre.setInt(1, id);
				pre.setString(2, name);
				pre.setString(3, address);
				
				System.out.println("Student information saved successfully.");
				
				System.out.println("Do you want to enter another student? (y/n)");
				choice = sc.nextLine();
				
				
			}
			
			
			
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
