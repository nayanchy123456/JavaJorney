package databaseconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Connect {
	
	public static void main(String[] args)
	{
		Connection conn=null;
		PreparedStatement pre = null;
		try
		{
			Class.forName("com.mysql.cj.jsbc.Driver");
			
		}
		
	}

}
