package Curs3;

import java.util.Scanner;

public class IfElseLogin {

	public static void main(String[] args) {
		
		String username = "Test";
		int password = 1234;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert username:");
		String user = scan.next();
		System.out.println("Please insert password:");
		int pass = scan.nextInt();
		
		if((username.equals(user)) && (password == pass)) {
			
			System.out.println("Login sucesfull");
		}else {
			System.out.println("username or password is wrong");

		}
		
	}

}
