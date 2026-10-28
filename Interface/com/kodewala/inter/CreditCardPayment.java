
    package com.kodewala.inter;
	
	class CreditCardPayment implements IPayment
   {
    @Override
	public double pay(double amount)
	{
	System.out.println("Credit card payment of " +  amount + " processed");
	return amount;
	}
   
   @Override
	public double refund(double amount)
	{
	System.out.println("Credit card refund of " + amount + " processed");
	return amount;
	}
	
   }