
   package com.kodewala.oops;
   
   class ATM
   {
   private String accountHolder;
   private double balance;
   
   ATM(String accountHolder, double balance)
   {
    this.accountHolder = accountHolder;
	this.balance = balance;
   }
   
    public void withdraw(double amount)
	{
	  if(validateAmount(amount) && checkBalance(amount))
	  {
	  balance = balance - amount;
	   System.out.println("Withdrawl successful");
	   System.out.println("Balance: " + balance);
	  } else {
	  System.out.println("Withdrawl failed");
	  }
	}
   
   private boolean validateAmount(double amount)
   {
   if(amount > 0){
    return true;
   } else {
     return false;
   }
   }
   
   private boolean checkBalance(double amount)
   {
    if(balance >= amount){
	return true; 
   } else {
    return false;
   }
   }
   }
   
   class  AtmCheck
   {
   public static void main(String[] args)
   {
    ATM atm = new ATM("Rahul", 5000);
	atm.withdraw(1500);
	atm.withdraw(40000);
   
   }
   }