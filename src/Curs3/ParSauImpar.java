package Curs3;

import java.util.Scanner;

public class ParSauImpar {
	
	public int askTheUser() {
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		return number;

	}
	
	public void checkNrIsOddOrEven() {
		
		if( askTheUser()  % 2 == 0) {	
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
	
	} 
	

}
