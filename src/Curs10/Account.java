package Curs10;

public interface Account {
	
	public void deposit(double amount) throws InvalidAmountException;
	public void withdraw(double amount) throws InsufficentFundsException;
	public void checkBalance();
	

}
