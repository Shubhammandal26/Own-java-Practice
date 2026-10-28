
   package com.kodewala.inter;
   
   class UpiPayment implements IPayment
   {
    @Override
	public double pay(double amount)
	{
	System.out.println("UPI payment of " +  amount + " processed");
	return amount;
	}
   
   @Override
	public double refund(double amount)
	{
	System.out.println("UPI payment of " + amount + " processed");
	return amount;
	}
	
   }