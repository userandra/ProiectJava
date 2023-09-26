package Curs5;

import java.util.Scanner;

public class ForVsWhile {
	
	public void rezolvareCuFor() {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Please enter a number:");
		
		for(int nr = scan.nextInt(); nr != 0 ; nr = scan.nextInt()) {
			
			System.out.println(nr*10);
			System.out.println("Please enter a number:");
			
		}
		scan.close();
		
	}
	
	
	public void rezolvareCuForDoi() {
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Please enter a number:");
		
		for(;;) {int nr = scan.nextInt();
				if(nr == 0) {
					break;}
				System.out.println(nr*10);
				System.out.println("Please enter a number:");
				
		}
		
	}
	
	public void rezolvareCuWhile() {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Please enter a number:");
		
		int nr = scan.nextInt();
		
		while(nr != 0) {
			
			System.out.println(nr*10);
			System.out.println("Please enter a number:");
			nr=scan.nextInt();
		}
			
	}
	public void rezolvareCuDoWhile() {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Please enter a number:");
		
		int nr = scan.nextInt();
		
		do{		
			System.out.println(nr*10);
			System.out.println("Please enter a number:");
			nr = scan.nextInt();
		}while(nr != 0);
			
	}
	
}




