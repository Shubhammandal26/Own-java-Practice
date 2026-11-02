
  package com.kodewala.types;
  
  interface ITransactionValidator
  {
  boolean validateTransaction(double balance, double withdrawAmount);
  }
  
  class Transaction
  {
  public static void main(String[] args)
  {
  
   ITransactionValidator transaction = (balance, withdrawAmount) ->
   {
   System.out.println("Available balance: " + balance);
   System.out.println("Withdrawal Amount: " + withdrawAmount);
     if(withdrawAmount <= 0)
	 {
	 System.out.println("Invalid");
	   return false;
	   
	 } else if(withdrawAmount > balance)
	 {
	 System.out.println("Insufficient Balance");
	   return false;
	   
	 } else
	 {
	 System.out.println("Transaction Successful");
	 return true;
	 } 
   };
   boolean result = transaction.validateTransaction(10000, 3000);
   System.out.println("Transaction status: " + result);
  }
  }