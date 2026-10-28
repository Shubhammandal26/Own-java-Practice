
    package com.kodewala.inter;
	
	class Account
	{
	 public static void main(String[] args)
	{
	 BankAccount bankAccount = new SavingAccount(1000);
	 bankAccount.deposit(1000);
	 bankAccount.withdraw(500);
	 bankAccount.checkBalance();
	
	}
	}