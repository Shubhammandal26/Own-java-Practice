
  package com.kodewala.oops;
  
  class DigitalWallet
  {
  public static void main(String[] args)
  {
   DigitalMoney money = new DigitalMoney("shubham", "WAL456321", 2000);
   money.addMoney(1000);
   money.payment(500);
     System.out.println(money.checkWallet());
  
  }
  }
  
   class DigitalMoney
   {
    private String userName;
	private String walletID;
	private int balance;
	
	public DigitalMoney(String userName,String walletID,int balance)
	{
	 this.userName = userName;
	 this.walletID = walletID;
	 this.balance = balance;
	}
	
	public int checkWallet()
	{
	 return balance;
	}
	
	public void addMoney(int amount)
	{
		   if (amount > 0) {
		balance = balance + amount;
		System.out.println("Money added sucessfully");
	} else{
		System.out.println("Invalid amount");
	}
	}
   
   
	
	public void payment(int amount)
	{	
		if(amount <= 0)
		{
			 System.out.println("Amount must be positive");
			
		} else if(amount > balance) {
			
			System.out.println("Insufficient funds");
		} else {
			balance = balance - amount;
			System.out.println("Payment sucessfully");
		}
	}
   }
	 
	
	