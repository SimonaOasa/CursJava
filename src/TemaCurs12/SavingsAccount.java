package TemaCurs12;

import curs12.InvalidAgeException;

public class SavingsAccount extends Account {
	
	public SavingsAccount() {
		accountOwner = new Customer ("Daniel5", "Adresa5", "Email5");
		balance = 55600;
		setAccountNumber(1000);
	}

	public SavingsAccount(Customer accOwn, double bal, int accNum) {
		accountOwner = accOwn;
		balance = bal;
		setAccountNumber(accNum);
		
	}
	
	
	@Override
	public void withdraw(int amount) throws InsuficientFundsException {
		if (amount > balance) {
			throw new InsuficientFundsException();
		}
		else {
			balance = balance - amount;
		}
	}

}
