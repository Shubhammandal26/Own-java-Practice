
    package com.kodewala.inheritance_type;
	
	class BankAccounts
	{
	  String accountHolder;
	  long accountNumber;
	  
	  BankAccounts(String accountHolder, long accountNumber)
	  {
		  this.accountHolder = accountHolder;
		  this.accountNumber = accountNumber;
	  }
	  public void displayAccountDetails()
	  {
		  System.out.println("Account Holder: " + accountHolder);
		   System.out.println("Account Number: " + accountNumber);
	  }
	}
	
	class SavingAccounts extends BankAccounts
	{
	  double balance;
	  
	  SavingAccounts(String accountHolder, long accountNumber,int balance)
	  {
		  super(accountHolder, accountNumber);
		  this.balance = balance;
	  }
	  public void displaySavingsAccount()
	  {
		  super.displayAccountDetails();
		  System.out.println("balance: " + balance);
	  }
	}
	
	class PremiumSavingsAccount extends SavingAccounts
	{
	   double interestRate;
	   
	   PremiumSavingsAccount(String accountHolder, long accountNumber,int balance,double interestRate)
	   {
		   super(accountHolder, accountNumber, balance);
		   this.interestRate = interestRate;
	   }
	   public void displayPremiumDetails()
	   {
		   super.displaySavingsAccount();
		   System.out.println("Interest Rate: " + interestRate);
	   }
	}
	
	 class BankManagement
	 {
	 public static void main(String[] args)
	 {
	  PremiumSavingsAccount account = new PremiumSavingsAccount("Rahul", 123456789L, 500000,6.5);
      account.displayPremiumDetails();
	 
	 }
	 }