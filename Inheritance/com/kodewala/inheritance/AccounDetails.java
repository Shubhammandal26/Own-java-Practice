
   package com.kodewala.inheritance;
   
   class BankAccount
   {
   String accountHolderName;
   long accountNumber;
   double balance;
   
    BankAccount(String accountHolderName, long accountNumber, double balance)
	{
	  this.accountHolderName = accountHolderName;
	  this.accountNumber = accountNumber;
	  this.balance = balance;
	}
	 
	  public void displayAccountDetails()
	  {
	   System.out.println("Account Holder Name: " + accountHolderName);
	   System.out.println("Account Number: " + accountNumber);
	   System.out.println("Remaining Balance: " + balance);
	  }
   }
   
   class SavingAccount extends BankAccount
   {
     double interestRate;
	 
	 SavingAccount(String accountHolderName, long accountNumber, double balance, double interestRate)
	 {
	   super(accountHolderName, accountNumber, balance);
	   this.interestRate = interestRate;
	 }
	 
	 public void displaySavingsDetails()
	 {
	 super.displayAccountDetails();
	 System.out.println("Interest rate is: " + interestRate);
	 }
   }
   
   class CurrentAccount extends BankAccount
   {
     double overdraftLimit;
	 
	 CurrentAccount(String accountHolderName, long accountNumber, double balance, double overdraftLimit){
	  super(accountHolderName, accountNumber, balance);
	  this.overdraftLimit = overdraftLimit;
	 }
	 
	 public void displayCurrentDetails()
	 {
	   super.displayAccountDetails();
	   System.out.println("Over draft limited: " + overdraftLimit);
	 }
   }
   
   class AccounDetails
   {
    public static void main(String[] args)
   {
    SavingAccount savingAccount = new SavingAccount("Shubham", 1001, 25000.0, 4.5);
	savingAccount.displaySavingsDetails();
	
	CurrentAccount currentAccount = new CurrentAccount("Rahul", 1002, 50000.0, 10000.0);
	currentAccount.displayCurrentDetails();
   
   }
   }