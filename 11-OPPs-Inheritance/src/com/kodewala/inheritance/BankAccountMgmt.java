package com.kodewala.inheritance;

class BankAcc
{
   private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	public BankAcc(String accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public void calculateInterest(double amount)
	{
		System.out.println("Interest calculation depends on account type");
	}
	
	
	public void displayDetails()
	{
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Balance: " + balance);
	}
}

class SavingsAccounts extends BankAcc
{

	public SavingsAccounts(String accountNumber, String accountHolderName, double balance)
	{
		super(accountNumber, accountHolderName, balance);
		
	}
	
	@Override
	public void calculateInterest(double amount)
	{
		double interest = amount * 5 / 100;
		System.out.println("Calculating Interest of Saving Account: " + interest);
	}
}

class CurrentAccounts extends BankAcc
{

	public CurrentAccounts(String accountNumber, String accountHolderName, double balance) 
	{
		super(accountNumber, accountHolderName, balance);
		
	}
	
	@Override
	public void calculateInterest(double amount)
	{
	  double interest = amount * 2 / 100;
		System.out.println("Calculating Interest of Current Account: " + interest);
	}
	
}
public class BankAccountMgmt 
{
	public static void main(String[] args)
	{
      BankAcc account1 = new SavingsAccounts("56892301", "Shivam", 2000);
      account1.calculateInterest(2000);
      account1.displayDetails();
      
      BankAcc account2 = new CurrentAccounts("789410", "Rahul", 3000);
      account2.calculateInterest(1500);
      account2.displayDetails();
 
	}

}
