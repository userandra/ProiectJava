package Curs2;

public class SalaryCalculator {

	public static void main(String[] args) {
		
		Tester tester1 = new Tester("Ioana", 25);
		System.out.println(tester1.nume);
		System.out.println(tester1.ratePerHour);
		
		Tester tester2 =  new Tester("Maria", 35);
		System.out.println(tester2.nume);
		System.out.println(tester2.ratePerHour);
		
		SalaryCalculator calculator = new SalaryCalculator();
		
		System.out.println("Salariul lui " + tester1.nume
				+ " este " + calculator.calculateWeekSalary(tester1.ratePerHour));
		
	}
	
	public int calculateWeekSalary(int salaryPerHour) {
		
		return 40 * salaryPerHour;
	}
	
}
