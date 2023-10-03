package Curs4;

import java.util.Scanner;

public class LetterSearch {
	
	private String text;
	
	private void askTheUser() {
		
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Please enter a text:");
		text = scan.next().toUpperCase();
		//text = scan.next();
		scan.close();		
	}
	
	public void letterSearch() {
		askTheUser();
		int counter = 0;
		
		for(int i=0; i<text.length(); i++) {
			//if(text.charAt(i)=='A' || text.charAt(i)=='a') {
			if(text.charAt(i)=='A') {
				counter++;
			}	
		}
		
		String result= counter==0 ? "Letter A was not found":"Letter A was found " + counter + " times!";
		System.out.println(result);
		}
		
	

}
