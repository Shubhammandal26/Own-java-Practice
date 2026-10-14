  
    package com.kodewala.oops;
	
	class Account
	{
	 private String accountHolderName;
	 private String accountNumber;
	 private  int balance;
	 
	 Account(String accountHolderName, String accountNumber, int balance)
	 {
		 this.accountHolderName = accountHolderName;
		 this.accountNumber = accountNumber;
		 this. balance = balance;
	 }
	 
	 public void doFundtransfer(int amount)
	 {
		 if(amount > 0 && amount <= balance)
		 {
			 balance = balance - amount;
		 } else{
			 System.out.println("Insufficient balance");
		 }
	 }
	 
	 public int checkBalance()
	 {
		   return balance;
	 }
	
	}
	
	
	class FundTransfer
	{
	 public static void main(String[] args)
	 {
	  Account account = new Account("Shubham", "41236598700", 1500);
      
   //  account.doFundtransfer(-500);   // Insufficient balance
       account.doFundtransfer(500);  // Remaining balance : 1000
  
      int balance = account.checkBalance();	 
	  
	  System.out.println("Remaining balance : " + balance);	
	  
	 }
	}