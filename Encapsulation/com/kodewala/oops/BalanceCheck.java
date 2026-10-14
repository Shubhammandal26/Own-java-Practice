
   package com.kodewala.oops;
   
   class BankAccount
   {
   private double balance;
    
	public BankAccount(double balance)
	{
	 this.balance = balance;
	}
	
	public void deposit(double amount)
	{
	  if(amount > 0){
	  balance = balance + amount;
	  System.out.println("Deposit amount: " + amount);
	  } else{
	   System.out.println("Invalid amount");
	  }
	}
	
	public void withdraw(double amount)
	{
	   if(amount > 0 && amount <= balance){
	     balance = balance - amount;
		  System.out.println("Withdrawn: " + amount);
	   } else {
	    System.out.println("Insufficient funds or invalid amount");
	   }
	}
	
	public double getBalance()
	{
	  return balance;
	}
	
	}
	
	class  BalanceCheck
	{
	 public static void main(String[] args)
	{
	 BankAccount acc = new BankAccount(1000);
	 
	 acc.deposit(500);
	 acc.withdraw(200);
	 System.out.println("Final balance: " + acc.getBalance());
	
	}
	}