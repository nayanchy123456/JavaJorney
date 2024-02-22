package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Spring2014 {
	public static void main(String[] args)
	{
		Connection conn = null;
		PreparedStatement pre = null;
		String query1,query2,query3,query4;
		ResultSet rs = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/Spring2014","root","");
			query1="create table Student (id int primary key, name varchar(225), address varchar(225), DOB varchar(225),Class varchar(225))";
			pre = conn.prepareStatement(query1);
			query2 ="insert into Student (id,name,address,DOB,Class) values(?,?,?,?,?)";
			pre = conn.prepareStatement(query2);
			pre.setInt(1, 11);
			pre.setString(2, "Hari");
			pre.setString(3, "ktm");
			pre.setString(4, "jan 21");
			pre.setString(5, "Computer");
			query3 ="insert into Student (id,name,address,DOB,Class) values(?,?,?,?,?)";
			pre = conn.prepareStatement(query3);
			pre.setInt(1, 111);
			pre.setString(2, "Ram");
			pre.setString(3, "ktm");
			pre.setString(4, "jan 22");
			pre.setString(5, "IT");
			
			query4 ="select * from Student where id<100";
			pre = conn.prepareStatement(query4);
			rs = pre.executeQuery();
			while(rs.next())
			{
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String address = rs.getString("address");
				String dob = rs.getString("DOB");
				String Class = rs.getString("class");
				
				System.out.println("id:" + id + " " + "name:" + name +" " + "address:" + address +" " + "dob:" + dob +" " + "class:" + Class);
			}
			
			
			System.out.println("successfully connected");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}
