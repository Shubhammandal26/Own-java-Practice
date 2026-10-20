  
   package com.kodewala.overloading;
	 
	 class BankAccount
	 {
	 double balance = 5000;
	  public void deposit(double amount)
	  {
	   System.out.println("Initial Balance: " + balance);
	   balance = balance + amount;
	   System.out.println();
	    System.out.println("Deposited: " + amount);
	   System.out.println("Updated Balance: " + balance);
	  }
	 
	 public void deposit(double amount, String accountHolder)
	 {
		 balance = balance + amount;
	  System.out.println("Account Holder Name: " + accountHolder);
	   System.out.println("Deposit: " + amount);
	    System.out.println("Updated Balance: " + balance);
		System.out.println();
	 }
	 
	 public void deposit(double amount, String accountHolder, String transactionType)
	 {
		 balance = balance + amount;
	 System.out.println("Deposit amount: " + amount);
	 System.out.println("Account Holder Name: " + accountHolder);
	 System.out.println("Transaction type: " + transactionType);
	  System.out.println("Updated Balance: " + balance);
	 }
	 }
	 
	 class BankMgmt
	 {
	 public static void main(String[] args)
	 {
	 BankAccount bankAccount = new BankAccount();
	 bankAccount.deposit(1000.0);
	 bankAccount.deposit(2000.0, "Rahul");
	 bankAccount.deposit(500.0, "Rahul", "Online");
	 }
	 }
   