package Curs9;

public class CasaDeMarcat {
	int nrItem = 0;
	Dulciuri[] produseDulce =  new Dulciuri[3];
	//Bomboane rafaelo =  new Bomboane();
	
	public void enterItems(Dulciuri dulce) {
		produseDulce[nrItem] = dulce;
		nrItem++;
	}
	
	public double costTotal() {
		double total =0;
		
		for(Dulciuri dulce : produseDulce) {
			total = total+ dulce.calculatePrice();
		}
		return total;
	}
	
		public static void main(String[] args) {
		
		
		CasaDeMarcat casa = new CasaDeMarcat();
		
		casa.enterItems(new Bomboane("Tic-tac", 2, 4));
		casa.enterItems(new Ciocolata("Poiana", 3));
		casa.enterItems(new Napolitane("Joe",25));

		
		System.out.println("Ai un total de " + casa.produseDulce.length + " produse!" );
		System.out.println("Ai de platit " + casa.costTotal() + " lei!");
		
		
		}
}

