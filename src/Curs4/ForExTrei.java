package Curs4;

import java.util.Scanner;

public class ForExTrei {

	public static void main(String[] args) {
		
		int num2;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Print number:");
		num2 = scan.nextInt();
		
		for(int i = 1; i<=num2; i++) {
		sum += i;	
		}
		System.out.println("Printeaza suma: "+ sum);

	}

}
