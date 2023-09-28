package Curs6;

import java.util.Scanner;

public class VerificaVocala {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Te rog introdu o litera :");
		char litera = scan.next().toUpperCase().charAt(0);
		
		switch(litera) {
		case 'A', 'E', 'I', 'O', 'U':
			System.out.println("Este vocala!");
			break;
		default:
			System.out.println("Este consoana!");
	}
	scan.close();

	}

}
