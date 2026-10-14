
  package com.kodewala.oops;
  
  class AtmCashWithdrawal
  {
  public static void main(String[] args)
  {
   Customer custo = new Customer("Shubham", "9630125478520", 2500.00);
   custo.cashWithdrawl(1000);
   double rembalance = custo.checkbalance();
   
   System.out.println("Cash withdrawl: " + rembalance);
   
   
  }
  }
  
  class Customer
  {
   private String accountHolder;
   private String accountNumber;
   private double balance;
   
  public  Customer(String accountHolder,String accountNumber,double balance)
   {
   this.accountHolder = accountHolder;
   this.accountNumber = accountNumber;
   this.balance = balance;
   }
   
   
   public void cashWithdrawl(int amount)
   {
	   if(balance > 0)
	   {
   if(amount <= 0)
   {
	   System.out.println("Invalid withdrawal amount.");
   } else if(amount > balance){
	    System.out.println("Insufficient balance.");
   } else{
     balance = balance - amount;
	 System.out.println("Withdrawal successful");
   }
	   } else {
		    System.out.println("Account balance must be positive");
	   }
   }
   
   // getter
   public double checkbalance()
   {
    return balance;
   }
  }