
     package com.kodewala.inter;
	 
	 class UPIPayments implements IPayments
   {
   @Override
    public boolean validatePayment(double amount)
	{
	if(amount > 0 && amount >= 100)
	{
	System.out.println("Amount is: " + amount);
	 return true;
	} else {
	System.out.println("Insufficient Amount");
	 return false;
	}
	}
	
	@Override
    public void processPayment(double amount)
	{
	 if(amount >= 10)
	 {
	 System.out.println("Amount is: " + amount);
	 } else {
	 System.out.println("Insufficient founds");
	 }
	}
	
   }