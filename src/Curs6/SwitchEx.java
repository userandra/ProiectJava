package Curs6;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
				
				Scanner scan =  new Scanner(System.in);
				System.out.println("Te rog introdu un calificativ:");
				String calificativ = scan.next();
				
				switch(calificativ.toUpperCase()) {
					case "A":
						System.out.println("Felicitari!");
						break;
					case "B":
						System.out.println("Destul de bine!");
						break;
					case "C":
						System.out.println("Suficient!");
						break;
					case "D":
						System.out.println("Insuficient!");
						break;
					default:
						System.out.println("Calificativ invalid!");
				}
				scan.close();
				
				
				
				/*int result =0;
				
				if(result == 2 || result == 6 || result == 12) {
					System.out.println("Ai dat " + result + " Imi pare rau! AI pierdut jocul!");			
				}
				
				switch(result) {
				
				case 2, 6 , 12:
					System.out.println("Ai dat " + result + " Imi pare rau! AI pierdut jocul!");
					break;
				}*/
							
			}


	}

