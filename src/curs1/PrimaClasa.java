package curs1;

public class PrimaClasa {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		PrimaClasa obiect = new PrimaClasa();
		obiect.sendMessage();
		
		System.out.println(obiect.afiseazaSuma());
		//System.out.println(obiect.sendMessage());
		
		int numar = 10 + obiect.afiseazaSuma();
		System.out.println(numar);

	}
	public void sendMessage() {
		System.out.println("Message");
		
	}
	
	public int afiseazaSuma() {
		
		int suma = 20+30;
		return suma;
	}
	
	
	
}
