package DbConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Fall2022_6b {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		PreparedStatement pre = null;
		String query1, query2, query3,query4;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_std","root","");
			query1 = "Create table tbl_std (roll int primary key , name varchar(225), faculty varchar(225), marks float)";
			pre = conn.prepareStatement(query1);
			 pre.executeUpdate();
			query2 ="insert into tbl_std (roll, name, faculty, marks) values(?,?,?,?)";
			pre = conn.prepareStatement(query2);
			pre.setInt(1, 1);
			pre.setString(2,"Ram");
			pre.setString(3, "BEIT");
			pre.setFloat(4, (float) 96.5);
			
			pre.setInt(1, 2);
			pre.setString(2,"Shyam");
			pre.setString(3, "BEC");
			pre.setFloat(4, (float) 94.5);
			
			pre.setInt(1, 3);
			pre.setString(2,"Hari");
			pre.setString(3, "BEIT");
			pre.setFloat(4, (float) 86.5);
			
			pre.executeUpdate();
			
			query3 ="select count(*) as total_students from tbl_std";
			pre=conn.prepareStatement(query3);
			rs = pre.executeQuery();
			
			  if (rs.next()) {
	                int totalStudents = rs.getInt("total_students");
	                System.out.println("Total Students: " + totalStudents);
	            }
			  
			  query4 ="select avg(marks) as avg_marks from tbl_std";
				pre=conn.prepareStatement(query4);
				rs = pre.executeQuery();
				
				 if (rs.next()) {
		                float avgMarks = rs.getFloat("avg_marks");
		                System.out.println("\nAverage Marks: " + avgMarks);
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
				conn.close();
				pre.close();
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}

	}

}
