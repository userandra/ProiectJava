package Curs4;

import java.util.Scanner;

public class OperatorConditional {
	
	int num1,num2;
	
	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1 = scan.nextInt();

		System.out.println("Enter second number: ");
		num2 = scan.nextInt();
		scan.close();
		
	}
	
	public void verifiyTheNumbers() {
		askTheUser();
		
		if(num1>0) {
			System.out.println("Num1 este pozitiv");
		}else {
			System.out.println("Num1 este negativ");
		}
		
		String result= (num1>0)? "Num1 este pozitiv" : "Num1 este negativ";
		System.out.println(result);
		result= (num2>0)? "Num2 este pozitiv" : "Num2 este negativ";
		System.out.println(result);
		result = (num1>0 && num2>0)? "Ambele numere sunt pozitive": "Ambele numere sunt negative";
		System.out.println(result);
		
		result = (num1>num2)? "Num1 este mai mare":(num2>num1)? "Num2 este mai mare" : "Num1 si Num2 sunt egale";
		System.out.println(result);
		
		result = (num1>num2)? "Num1 este mai mare":(num2 == num1)?"Num1 si Num2 sunt egale": "Num2 este mai mare";
		System.out.println(result);
		
		}
	}
	


