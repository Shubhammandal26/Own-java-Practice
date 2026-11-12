package com.revision.oops;

public class UPIPayment implements IPayment
{

	@Override
	public void pay(double amount) 
	{
		System.out.println("UPI payment: Rs. " + amount );
		
	}

	@Override
	public void checkPaymentStatus() 
	{
		System.out.println("UPI Payment successful");
		
	}

}
