package com.kodewala.inheritance;

class Accounts 
{
	public void openBankAccount(String name, String address, String types)
	{
		System.out.println("Open Account()... " + name + " address: " + address + " types: " + types);
	}
}

class SavingAccount extends Accounts
{
	public void openSavingAccount(String name, String address, String types)
	{
		openBankAccount(name, address, types);
	}
}
public class Driver {

	public static void main(String[] args)
	{
		SavingAccount account = new SavingAccount();
		account.openBankAccount("Shubham", "Bangalore", "Saving");

	}

}
