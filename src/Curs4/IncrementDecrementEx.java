package Curs4;

public class IncrementDecrementEx {

	public static void main(String[] args) {
		
		System.out.println("- POST");
		int num1 = 25;
		System.out.println("Valoarea lui num1 inainte de increment " + num1);
		System.out.println("Valoarea lui num1 in POST increment " + num1++);
		System.out.println("Valoarea lui num1 dupa increment " + num1);

		System.out.println("- PRE");
		int num2 = 35;
		System.out.println("Valoarea lui num2 inainte de increment " + num2);
		System.out.println("Valoarea lui num2 in PRE increment " + ++num2);
		System.out.println("Valoarea lui num2 dupa increment " + num2);
		
		
		System.out.println("- POST");
		int num3 = 45;
		System.out.println("Valoarea lui num3 inainte de decrement " + num3);
		System.out.println("Valoarea lui num3 in POST decrement " + num3--);
		System.out.println("Valoarea lui num3 dupa decrement " + num3);

		System.out.println("- PRE");
		int num4 = 55;
		System.out.println("Valoarea lui num4 inainte de decrement " + num4);
		System.out.println("Valoarea lui num4 in PRE decrement " + --num4);
		System.out.println("Valoarea lui num4 dupa decrement " + num4);
		
	}
}
