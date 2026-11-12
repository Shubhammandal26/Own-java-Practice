package com.revision.oops;

public class SavingsAccount implements IBankAccount
{
     private double balance;
     
	public SavingsAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void deposit(double amount)
	{
	    balance += amount;	
		System.out.println("Deposited " + amount + "in saving account, New balance: " + balance);
	}

	@Override
	public void withdraw(double amount) {
		if(balance - amount >= MIN_BALANCE)
		{
			balance -= amount;
			System.out.println("Withdrawn " + amount + " from savings Account. New Balance: " + balance);
		} else {
			System.out.println("Insufficient balance");
		}	
	}

	@Override
	public double checkBalance() 
	{	
		return balance;
	}

}
