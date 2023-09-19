package Curs4;

import java.util.Scanner;

public class Calculator {
	
	private int num1,num2, num3, result;
	private char operatie;
	
	private void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter num1:");
		num1 = scan.nextInt();
		System.out.println("Please enter operation:");
		operatie = scan.next().charAt(0);
		System.out.println("Please enter num2:");
		num2=scan.nextInt();
		scan.close();
		
	}
	
	public void calculator() {
		askTheUser();
		boolean flag=true;
		
		if(operatie == '+') {
			result = num1 + num2;
			//System.out.println(num1 +" "+ operatie + " "+num2 + " = " + result);
		}else if(operatie == '-') {
			result = num1 - num2;
			//System.out.println(num1 +" "+ operatie +" "+num2 + " = " + result);
		}else if(operatie == '*' || operatie == 'x' ) {
			result = num1 * num2;
			//System.out.println(num1 +" "+ operatie +" "+num2 + " = " + result);
		}else if(operatie == '/' ||operatie == ':' ) {
			result = num1 / num2;
			//System.out.println(num1 +" "+ operatie +" "+num2 + " = " + result);
		}else {
			System.out.println("Wrong operation!");
			flag=false;
		}
		
		if(flag) {
			System.out.println(num1 +" "+ operatie + " "+num2 + " = " + result);
		}
	}

}
