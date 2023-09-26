package Curs5;

import java.util.Scanner;

public class ValidareParola {
	
	String username, password;
	Scanner scan = new Scanner(System.in);
	boolean validare = true;
	
	public void printReguliParola() {
		System.out.println("Reguli parola:");
		System.out.println("Parola trebuie sa aiba minim 10 caractere");
		System.out.println("Parola trebuie sa contina cel putin un caracter upper case");
		System.out.println("Parola trebuie sa fie diferita de username");
		
	}
	
	public void getUsername() {
		System.out.println("Introdu username:");
		username = scan.next();
		
	}
	
	public String getPassword() {
		System.out.println("Introdu password:");
		password = scan.next();
		return password;
	}
	
	public void validareReguliParola(String password) {
		validare = true;
		
		if(password.length()<10) {			
			
			System.out.println("Parola trebuie sa aiba minim 10 caractere");
			validare = false;
		}
		if(password.equals(password.toLowerCase())) {
			
			System.out.println("Parola trebuie sa contina cel putin un caracter upper case");
			validare = false;
			
		}
		
		if(password.equals(username)) {
			
			System.out.println("Parola trebuie sa fie diferita de username");
			validare = false;
		}
	}
		
		
		public void validareParola() {
			
			do {
				validareReguliParola(getPassword());
				
			}while (!validare);
				
				System.out.println("Parola este valida!");
			}
				
		}
	
		
		


		
		

