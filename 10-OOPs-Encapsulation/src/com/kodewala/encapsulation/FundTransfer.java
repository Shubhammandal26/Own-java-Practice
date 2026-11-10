package com.kodewala.encapsulation;

public class FundTransfer 
{
	private String accountHolderName;
	private String accountNumber;
	private  double balance;
	
	public FundTransfer(String accountHolderName, String accountNumber, double balance) {
		super();
		
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void doDebit(int amount)
	{
		if(amount > 0 && amount <= balance )
		{
		balance = balance - amount;
		System.out.println("Balance: " + balance);
		} else {
			System.out.println("Insufficient balance");
		}
	}
	
	public void doCredit(int amount)
	{
		if(amount > 0)
		{
			balance = balance + amount;
		} else {
			System.out.println("Invalid credit amount");
		}
	}
	
	public void checkBalance()
	{
		System.out.println("Balance: " + balance);
	}
	
     }
