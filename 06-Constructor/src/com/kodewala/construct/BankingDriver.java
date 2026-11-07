package com.kodewala.construct;

class Bank
{
	String bankName;
	
	Bank(String bankName)
	{
		this.bankName = bankName;
	}
}

class Customer extends Bank
{
	String accountHolderName;
	String branchName;
	double balance;
	
	Customer(String bankName, String accountHolderName, String branchName, double balance)
	{
		super(bankName);
		this.accountHolderName = accountHolderName;
		this.branchName = branchName;
		this.balance = balance;
	}
	
	public void displayCustomerDetails()
	{
		System.out.println("Bank Name: " + bankName);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Bank Branch: " + branchName);
		System.out.println("Bank Balance: " + balance);
	}
	
}
public class BankingDriver {

	public static void main(String[] args) 
	{
		Customer cus = new Customer("Bank Of India", "Shubham", "Hata", 12000.00);
		cus.displayCustomerDetails();

	}

}
