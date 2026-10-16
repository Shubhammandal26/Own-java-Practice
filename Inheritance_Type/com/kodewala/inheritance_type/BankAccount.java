
  package com.kodewala.inheritance_type;
  
    class Account
{
	String accountHolderName;
	String accountNumber;
	int age;
	
	public Account(String accountHolderName, String accountNumber, int age) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.age = age;
	}
	
	public void displayAccount()
	{
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Age: " + age);
	}
}

class SavingAccount extends Account
{
	String bankName;

	public SavingAccount(String accountHolderName, String accountNumber, int age, String bankName) 
	{
		super(accountHolderName, accountNumber, age);
		this.bankName = bankName;
	}
	
	public void displaySavingAccount() {
		super.displayAccount();
		System.out.println("Bank Name: " + bankName);
	}
	
}

class PensionAccount extends SavingAccount
{
	String occupation;
	double balance;
	
	public PensionAccount(String accountHolderName, String accountNumber, int age, String bankName, String occupation,
			double balance) {
		super(accountHolderName, accountNumber, age, bankName);
		this.occupation = occupation;
		this.balance = balance;
	}


	public void displayPensionAccount() {
		super.displaySavingAccount();
		System.out.println("Occupation: " + occupation);
		System.out.println("Balance: " + balance);
	}
}

public class BankAccount {

	public static void main(String[] args) 
	{
		PensionAccount pensionAccount = new PensionAccount("shubham", "45632100789", 24, "BOI", "Software Developer",29800.00);
            pensionAccount.displayPensionAccount();
	}

}
    // Hierarchical inheritance