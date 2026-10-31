

   package com.kodewala.inter2;
   
   interface IBank 
   {
    void calculateInterest(double amount);
	
	default void displayBankDetails()
	{
	 System.out.println("Welcome to the Bank");
	}
	
	static void calculateGST(double amount)
	{
	 double gst = amount * 18/100;
	 System.out.println("Calculated GST: " + gst);
	}
   }
   
   class SBI implements IBank
   {
    public void calculateInterest(double amount)
	{
	  double interest = (amount * 7) / 100;
	  System.out.println("Calculated interest: " + interest);
	}
   }
   
   class HDFC implements IBank
   {
    public void calculateInterest(double amount)
	{
	  double interest = (amount * 8) / 100;
	  System.out.println("Calculated interest: " + interest);
	}
   }
   
   class BankInterest
   {
   public static void main(String[] args)
   {
   IBank.calculateGST(50000);
   
   IBank sbi = new SBI();
   sbi.calculateInterest(50000);
   sbi.displayBankDetails();
   
   IBank hdfc = new HDFC();
   hdfc.calculateInterest(50000);
   hdfc.displayBankDetails();
   
   }
   }