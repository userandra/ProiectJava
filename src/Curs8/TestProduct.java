package Curs8;

public class TestProduct {
	
	
	public static void main(String[] args) {

		//Product produs =  new Product();
		
		Shoes pantof =  new Shoes(21, 35);
		System.out.println(pantof.calculatePrice());
		pantof.ratingProduct();
		System.out.println("--------------------------");
		
		Tshirt tricou = new Tshirt(1, 2, 3);
		System.out.println(tricou.calculatePrice());
		tricou.ratingProduct();
		
	}

}
