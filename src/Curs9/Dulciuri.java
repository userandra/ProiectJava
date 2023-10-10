package Curs9;

public class Dulciuri {
	
	private String nume;
	private double pretVanzare;
	
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public double getPretVanzare() {
		return pretVanzare;
	}
	public void setPretVanzare(double pretVanzare2) {
		this.pretVanzare = pretVanzare2;
	}
	
	public double calculatePrice() {
		
		return pretVanzare +19;
		
		
		
	}

}
