package Curs4;

import java.util.Scanner;

public class TablaInmultirii {

	public static void main(String[] args) {
		
		int num1;
		int produs = 0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Printeaza numar:");
		num1 = scan.nextInt();
		
		for(int i =1; i<=10; i++) {
			
			produs = i*num1;
			System.out.println(i + "*" +num1+ " = " + produs);
		}
		
	}

}
