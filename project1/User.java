package project1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		while(true) {
			try {
			System.out.println("enter:1 for login\nenter:2 for register\nenter:3 for exit\n");
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Scanner scn = new Scanner(System.in);
			//int val = Integer.parseInt(br.readLine());
			int val=scn.nextInt();
			switch(val) {
			case 1 :
				Login.enterDetails();
				break;
			case 2 :
				Register.register();
				break;
			case 3 :
				break;
			default :
				System.out.println("worng choise ! enter right value");
					
				}	
		}catch(Exception e) {
			System.out.println(e);
		                  }
		}
		
	}

}
