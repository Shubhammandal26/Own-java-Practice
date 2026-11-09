package com.kodewala.inheritance;

class Account
{
	double balance;
	
	Account(double balance)
	{
		this.balance = balance;
	}
	public void showBalance()
	{
		System.out.println("Account Balance: " + balance);
	}
}

class SavingsAccount extends Account
{
   double interestRate;
   
	SavingsAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	public void calculatingInterest()
	{
		double interest = balance * interestRate / 100;
		System.out.println("Interest Earned: " + interest);
	}
}

public class BankSystem {

	public static void main(String[] args)
	{
		SavingsAccount sa = new SavingsAccount(10000, 5);
		sa.showBalance();
		sa.calculatingInterest();
	}

}
