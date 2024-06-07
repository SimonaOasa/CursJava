package TemaCurs12;

public abstract class Account {

	private int accountNumber;
	public double balance;
	public Customer accountOwner; 
	
	//Customer accountOwner; 
	//Customer accountOwner = new Customer();
	
	public Account () {
		accountNumber = 123456789;
		balance = 44500;
		accountOwner = new Customer ("Daniel4", "Adresa4", "Email4");
	}
	
	public Account (int accNum, double bal, Customer accOwn) {
		accountNumber = accNum;
		balance = bal;
		accountOwner = accOwn;
	}
	
	public void setAccountNumber(int accNum) {
		accountNumber = accNum;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	
    public abstract void withdraw (int amount) throws InsuficientFundsException;			
	
}
