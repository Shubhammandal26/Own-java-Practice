

    package com.kodewala.polymorphism;
   
   class BankAccount
   {
    public void displayDetails()
	{
	System.out.println("Displaying bank account details...");
   }
   }
   
   class SavingAccounts extends BankAccount
   {
   @Override
    public void displayDetails()
	{
	System.out.println("Displaying savings account details...");
   }
   public void calculateInterest()
   {
    System.out.println("Calculating savings account interest...");
   }
   }
   
   class BankingSystem
   {
    public static void main(String[] args)
   {
       BankAccount bank = new SavingAccounts(); // upcasting
	   bank.displayDetails();
	   
	   if(bank instanceof SavingAccounts)
	   {
		   SavingAccounts savings = (SavingAccounts) bank; // downcasting
		   savings.calculateInterest();
	   }
   
   }
   }
    