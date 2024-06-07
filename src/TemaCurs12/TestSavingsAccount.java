package TemaCurs12;

import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) {


		/*Customer cust1 = new Customer(); 
		System.out.println(cust1);
		
		System.out.println(cust1.getName() + " " + cust1.getAddress() + " " + cust1.getEmail());

		Customer cust2 = new Customer(); 
		cust2.setName("Gigel");
		cust2.setAddress("Adresa2");
		cust2.setEmail("Email2");
		System.out.println(cust2);
		
		Customer cust3 = new Customer("Daniel", "Adresa3", "Email3"); 
		System.out.println(cust3);*/
		
		
		Customer cust3 = new Customer("Daniel", "Adresa3", "Email3"); 
		
		SavingsAccount save = new SavingsAccount(cust3, 10000, 1); 
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Introdu amount: ");
        
        int num1 = scan.nextInt();
        
        try {
			save.withdraw(num1);
		} catch (InsuficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("Balance: " + save.balance);
       
	}

}
