package Curs3;

import java.util.Scanner;

public class GreateastOfThreeNumbers {
	
int nr1, nr2, nr3;
	
	public void askTheUserForNumbers() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter nr 1:");
		nr1 = scan.nextInt();
		System.out.println("Enter nr 2:");
		nr2 = scan.nextInt();
		System.out.println("Enter nr 3:");
		nr3 = scan.nextInt();
		scan.close();
	}
	
	public void checkTheGreatestNumber() {
		askTheUserForNumbers();
		
		if(nr1 > nr2 && nr1 > nr3) {
			System.out.println(nr1 +  " is the greatest!");
			
		}else if(nr2 > nr1 && nr2 > nr3) {
			
			System.out.println(nr2 +  " is the greatest!");

		}else if(nr3 > nr1 && nr3 > nr2) {
			
			System.out.println(nr3 +  " is the greatest!");

		}else {
			System.out.println("Some numbers are equal");
		}
	
	
	}

}
