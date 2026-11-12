package com.revision.oops;

public class Customer implements ILoanService, IBankService
{
     private double balance;
	public Customer(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit " + amount + " and Balance : " + balance);
	}

	@Override
	public void withdraw(double amount) 
	{
		if(amount > 0 && balance >= amount) {
		balance -= amount;
		System.out.println("Withdrawl " + amount + " from Account: " + balance + " remaining");
	} else {
	System.out.println("Insufficient Balance");	
	}
	}

	@Override
	public void applyForLoan(double amount) 
	{
		System.out.println("Apply for loan: " + amount);
	}

	@Override
	public void checkLoanStatus() 
	{
	System.out.println("Checking loan status...");	
	}
}
