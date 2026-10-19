
 package com.kodewala.abstraction;
 
 class ATM
 {
	 private String pin = "1234";
     private int balance = 5000;
   public boolean withdrawCash(String pin, int amount, String enteredPin)
   {
	   if(amount > 0 &&  verifyPin(enteredPin)&& checkBalance(amount, balance) && checkCashAvailability(amount))
	   {   
//	verifyPin(enteredPin);
//	checkBalance(amount, balance);
//	checkCashAvailability(amount);
   System.out.println("Cash withdrawn successfully!");
    return true;
	} else {
	System.out.println("Withdrawl failed!");
	return false;
	   }
   }
  
  private boolean verifyPin(String enteredPin)
  {
  if(enteredPin.equals(pin))
  {
   System.out.println("Verifying PIN...");
   return true;
  } else {
     System.out.println("Wrong PIN...");
  }
  return false;
  
  }
  
  private boolean checkBalance(int amount,int balance)
  {
  if(amount > 0 && amount <= balance)
  {
     System.out.println("Checking account balance...");
	 return true;
	 } else {
	  System.out.println("Insufficient balance");
	  return false;
	 }
  }
  
  private boolean checkCashAvailability(int amount)
  {
  if(amount <= 1500){
   System.out.println("Checking ATM cash availability...");
   return true;
  } else {
   System.out.println("No cash available");
   return false;
  }
 }
 }
 
 class ATMManagement
 {
  public static void main(String[] args)
  {
   ATM atm = new ATM();
   atm.withdrawCash("1234", 1000, "1234");
  }
 }