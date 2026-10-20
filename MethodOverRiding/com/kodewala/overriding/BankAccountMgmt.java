
    package com.kodewala.overriding;
	
	class BankAccount
	{
	 public void calculateInterest()
	 {
	 System.out.println("Calculating general bank interest");
	 }
	}
	
	class SavingsAccount extends BankAccount
	{
	@Override
	public void calculateInterest()
	{
	System.out.println("Savings account interest");
	}
	}
	
	class FixedDepositAccount extends BankAccount
	{
	@Override
	 public void calculateInterest()
	 {
	 System.out.println("Fixed deposit interest");
	 }
	}
	
	class BankAccountMgmt
	{
	public static void main(String[] args)
	{
	 BankAccount bank = new BankAccount();
	 bank.calculateInterest();
	 
	 SavingsAccount saving = new SavingsAccount();
	 saving.calculateInterest();
	 
	 FixedDepositAccount fixed = new FixedDepositAccount();
	 fixed.calculateInterest();
	}
	}