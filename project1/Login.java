package project1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Scanner;

public class Login {
		
		public static void enterDetails()
		{
			try
			{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","aniket","12345");
			Statement smt = con.createStatement();
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Scanner scn = new Scanner(System.in);
			System.out.println("<-------your--Login--page-------------->");
			System.out.print("\n");
			System.out.println("please Enter your Enrollment number");
			int rollnumber = scn.nextInt();scn.nextLine();//Integer.parseInt(br.readLine());
			System.out.println("Enter your password");
			String password = scn.next();//br.readLine();
			// cheking that user id and password resgisted or not
			if(IsRegistered.isRegister(rollnumber,password,con)) {
				System.out.println("thank you for Login ");
				return;
			}
			else {
				System.out.println("you have not registered!!! please register");
			}
			return;
			}catch(Exception e) {
			
			}
			

			
		
		}

}
