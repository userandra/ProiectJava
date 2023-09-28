package Curs6;

public class ArrayEx {

	public static void main(String[] args) {
		
		String[] textArray= new String[4];
		//String[] textArray = {null, null, null, null};
		
		System.out.println(textArray[0]);
		textArray[0] = "This ";
		System.out.println(textArray[0]);
		textArray[1] = "is ";
		System.out.println(textArray[1]);
		textArray[2] = "an ";
		System.out.println(textArray[2]);
		textArray[3] = "Array ";
		System.out.println(textArray[3]);
		
		System.out.println();

		for (int i =0; i<textArray.length; i++) {
			
			System.out.print(textArray[i]);
		
		}
		System.out.println("\n____________________________");
		
		for(String element : textArray) {	
			
			System.out.print(element);
		}
	}

}
