package com.kodewala.encapsulation;

public class BankAcount 
{
  private String accountHolderName;
  private int accountNumber;
  private int balance;
  
  public BankAcount(String accountHolderName, int accountNumber, int balance) {
	super();
	this.accountHolderName = accountHolderName;
	this.accountNumber = accountNumber;
	this.balance = balance;
  }
  
  public void deposit(int amount)
  {
	  if(amount > 0 )
	  {
	  balance = balance + amount;
  }
  }
  
  public void withdraw(int amount)
  {
	  if(amount > 0 && amount <= balance)
	  {
	  balance = balance - amount;
  } else {
	  System.out.println("Insufficient Balance");
  }
  }
  
  public void checkBalance()
  {
	  System.out.println("Balance: " + balance);
  }
  
  public void displayAccountDetails()
  {
	  System.out.println("Account Holder Name: " + accountHolderName);
	  System.out.println("Account Number: " + accountNumber);
  }

}
