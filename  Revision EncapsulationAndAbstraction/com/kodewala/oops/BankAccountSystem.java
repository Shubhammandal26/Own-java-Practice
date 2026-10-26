
 package com.kodewala.oops;
 
 class AccountHolder
 {
  private double balance;
  private String accountHolder;
  
  AccountHolder(double balance, String accountHolder)
  {
   this.balance = balance;
   this.accountHolder = accountHolder;
   
   System.out.println("Balance: " + balance);
   System.out.println("AccountHolder: " + accountHolder);
  }
  
  public void deposit(double amount)
  {
    balance = amount + balance;
   System.out.println("Available Balance: " + balance);
  }
  
  public String getAccountHolder()
  {
   return accountHolder;
  }
  
  public double getBalance()
  {
   return balance;
  }
  
  public void withdraw(double amount)
  {
  
   if(validateAmount(amount) && checkBalance(amount))
   {
    double remBalance = balance - amount;
   balance = remBalance;
   
    System.out.println("Withdrawl successful.");
     System.out.println("Remainging balance: " + remBalance);	 
    } 
	else 
   {
    System.out.println("Insufficient funds or Invalid amount");
   }
  }
   
   private boolean validateAmount(double amount)
   {
    if(amount > 0)
	{
	   return true;
	} else
	{
	 return false;
	}
   }
    private boolean checkBalance(double amount)
	{
	if(balance >= amount){
	return true;
    } else{
	 return false;
	}
 }
  }
  
  class BankAccountSystem
  {
   public static void main(String[] args)
  {
    AccountHolder accountHolder = new AccountHolder(5000, "Rahul");
	accountHolder.deposit(1000);
	accountHolder.withdraw(200);
	System.out.println("Final Balance: " + accountHolder.getBalance());
  }
  }