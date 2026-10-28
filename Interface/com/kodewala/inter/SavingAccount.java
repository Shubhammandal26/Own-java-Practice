
    package com.kodewala.inter;
	
	class SavingAccount implements BankAccount
	{
	 private double balance;
	 
	 public SavingAccount(double balance)
	 {
	  this.balance = balance;
	 }
	 
	 @Override
	 public void deposit(double amount)
	 {
	  balance += amount;
	  System.out.println("Deposited " + amount + " in savings Account. New Balance: "  + balance);
	 }
	 
	 @Override
	 public void withdraw(double amount)
	 {
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