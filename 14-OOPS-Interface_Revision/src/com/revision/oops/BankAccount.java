package com.revision.oops;

public class BankAccount {

	public static void main(String[] args) 
	{
		SavingsAccount saving = new SavingsAccount(2500);
		saving.deposit(500);
		saving.withdraw(1000);
		saving.checkBalance();

		CurrentAccount ca = new CurrentAccount(1500);
		ca.deposit(500);
		ca.withdraw(1200);
		ca.checkBalance();
	}

}
