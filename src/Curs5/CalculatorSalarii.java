package Curs5;

import java.util.Scanner;

public class CalculatorSalarii {

	public static void main(String[] args) {
	
		//while loop
		Scanner scan  = new Scanner(System.in);
		System.out.println("Va rugam sa introduceti orele lucrate:");
        /*int oreLucrate1 = scan.nextInt();
        
        while(oreLucrate1>40 || oreLucrate1<1) {
        	System.out.println("Nr invalid de ore");
        	System.out.println("Introdu un numar intre 1 si 40:");
        	oreLucrate1 = scan.nextInt();
        }
        
        System.out.println("Salariul tau este :" +oreLucrate1*25);*/

        //for loop
		
		int oreLucrate;
		
		for(oreLucrate=scan.nextInt();oreLucrate>40||oreLucrate<1;oreLucrate=scan.nextInt()) {
			
			System.out.println("Nr invalid de ore");
        	System.out.println("Introdu un numar intre 1 si 40:");	
		}
        System.out.println("Salariul tau calculat pentru saptamana trecuta este :" +oreLucrate * 25);
        
	}    
}