package Curs6;

import java.util.Scanner;

public class DIceGame {

	public static void main(String[] args) {
		
		int dice1 = 0;
		int dice2 = 0;
		int result = 0;
		boolean raspuns = true;
		
		
		/*while(raspuns) {
			dice1 = (int) (Math.random()*6+1);	
			dice2 = (int) (Math.random()*6+1);
			
			result = dice1+dice2;
			if(result == 2 || result == 6 || result == 12) {
				System.out.println("Ai dat " + result + " Imi pare rau! AI pierdut jocul!");
				break;
				//raspuns = false;
				
			}else if (result == 7 || result == 11) {
				System.out.println("Ai dat " + result + " Felicitari! AI castigat jocul!");
				break;
				//raspuns = false;
				
			}else if(result == 3 || result == 10) {
				System.out.println("Ai dat " + result + " Automat mai dai o data!");

			}else {
				System.out.println("Ai dat " + result);
				Scanner scan  =  new Scanner(System.in);
				System.out.println("Mai vrei sa joci ?");
				raspuns =  scan.nextBoolean();
			}
		
		}*/
		
		do {
			raspuns = false;
			
			dice1 = (int) (Math.random()*6+1);	
			dice2 = (int) (Math.random()*6+1);
			result = dice1+dice2;
			
			if(result == 2 || result == 6 || result == 12) {
				System.out.println("Ai dat " + result + " Imi pare rau! AI pierdut jocul!");
				
			}else if (result == 7 || result == 11) {
				System.out.println("Ai dat " + result + " Felicitari! AI castigat jocul!");

			}else if(result == 3 || result == 10) {
				System.out.println("Ai dat " + result + " Automat mai dai o data!");

			}else {
				System.out.println("Ai dat " + result);
				Scanner scan  =  new Scanner(System.in);
				System.out.println("Mai vrei sa joci ?");
				raspuns =  scan.nextBoolean();
			}
			
		}while(result == 3 || result ==10 || raspuns == true);	

	}
}

