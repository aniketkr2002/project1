package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class IsRegistered {
	public static boolean isRegister(int roll,String password,Connection con) {
		try
		{
		
		Statement pr  = con.createStatement();
		ResultSet rs =pr.executeQuery("select * from logdetails");
		while(rs.next()) {
			int r =rs.getInt(3);
			String s =rs.getString(2);
			if(r==roll && s.equalsIgnoreCase(password)) {
				System.out.println("user found");
				return true;
			}
		}
		
		}catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}
}
