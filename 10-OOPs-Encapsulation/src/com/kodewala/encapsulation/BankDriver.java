package com.kodewala.encapsulation;

public class BankDriver {

	public static void main(String[] args) 
	{
		BankAcount account = new BankAcount("Shubham", 451203, 5000);
		account.deposit(2000);
		account.withdraw(1500);
		account.withdraw(7000);
		account.deposit(-500);
		
		account.checkBalance();
		account.displayAccountDetails();

	}

}
