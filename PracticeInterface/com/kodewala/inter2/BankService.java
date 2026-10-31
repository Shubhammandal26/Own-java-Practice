

   package com.kodewala.inter2;
   
   interface BankService
   {
    void deposit(double amount);
	}
	
	interface LoanService
	{
	 void applyLoan(double amount);
	}
	
	class Customer implements BankService, LoanService
	{
	 public void deposit(double amount)
	 {
	 System.out.println("Deposited: " + amount);
	 }
	 
	 public void applyLoan(double amount)
	 {
	 System.out.println("Loan applied for: " + amount);
	 }
	}
	
	class BankingService
	{
	 public static void main(String[] args)
	{
	 Customer customer = new Customer();
	 customer.deposit(5000);
	 customer.applyLoan(200000);
	}
	}