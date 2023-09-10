package project1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Register {
	public static void register() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","aniket","12345");
			Statement smt =  con.createStatement();
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Scanner scn = new Scanner(System.in);
			System.out.println("<-------your--Login--page-------------->");
			System.out.println("enter your name");
			String name= scn.next(); //br.readLine();
			System.out.print("please Enter your Enrollment number\n");
			int rollnumber =scn.nextInt() ;//Integer.parseInt(br.readLine());
			System.out.println("Enter your password\n");
			String password = scn.next();//br.readLine();
			PreparedStatement pmt = con.prepareStatement("insert into logdetails  values(?,?,?)");
			pmt.setString(1,name);
			pmt.setString(2, password);
			pmt.setInt(3, rollnumber);
			System.out.println(pmt.executeUpdate()+" data insert");
			System.out.println("your are now resisted");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
     			e.printStackTrace();
		} 
		
	}

}
