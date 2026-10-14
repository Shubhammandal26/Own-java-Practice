
   package com.kodewala.oops;
   
   class ATM
   {
    private double balance = 1000.0;
	private String pin = "1234";
   
   public void withdraw(double amountToWithdraw,String enterdPin)
   {
	 System.out.println("Current Balance: " + balance);
      if(enterdPin.equals(pin) && amountToWithdraw <= balance)
	  {
          balance = balance - amountToWithdraw;
		  System.out.println("Balance Post withdraw: " + balance);
	  } else {
		   System.out.println("Error: Incorrect PIN or insufficient funds");
	  }
   }
   
   public void deposit(double amount, String enterdPin)
   {
	   if(enterdPin.equals(pin))
	   {
		   balance = balance + amount;
		   System.out.println("RS." + amount + "deposited. New balance: RS." + balance);
	   } else {
		   System.out.println("Error: Incorrect PIN");
	   }
   }
   }
   
   class User
   {
   public static void main(String[] args)
   {
    ATM atm = new ATM();
	// atm.balance = 12000;  // not allowed to access balance directly. This is encapsulated
	atm.deposit(120, "1234");
	atm.withdraw(200, "1234");
   
   }
   }