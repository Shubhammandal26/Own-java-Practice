

   package com.kodewala.inter2;
   
   interface BankServices
   {
    void deposit(double amount);
	void withdraw(double amount);
   }
   
   interface LoanServices
   {
    void applyLoan(double amount);
   }
   
   
   
   class Customers implements BankServices,LoanServices
   {
   public void deposit(double amount)
   {
   System.out.println("Deposited Amount: " + amount);
   }
   
   public void withdraw(double amount)
   {
   System.out.println("Withdraw Amount: " + amount);
   }
   
   public void applyLoan(double amount)
   {
   System.out.println("Loan Amount: " + amount);
   }
   }
   
   class BankingApplication
   {
   public static void main(String[] args)
   {
    Customers customers = new Customers();
	customers.deposit(5000);
	customers.withdraw(1000);
	customers.applyLoan(100000);
   }
   }