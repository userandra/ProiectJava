package Curs9;

public class Napolitane extends Dulciuri {
	
	public final double CANTITATE_BAX = 10;
	
	public Napolitane(String nume,double pretVanzare) {
		setNume(nume);
		setPretVanzare(pretVanzare);
		
	}
	
	//nume_metoda_care_face -> snake case phyton
	//camelCase java

		@Override
		public double calculatePrice() {
		return getPretVanzare()*CANTITATE_BAX +19;
	}
	
	
}
