package com.revision.oops;

public class DebitCardPayment implements IPayment 
{

	@Override
	public void pay(double amount) 
	{
		System.out.println("Debit Card payment: Rs. " + amount );	
	}

	@Override
	public void checkPaymentStatus() {
		System.out.println("Debit Card Payment successful");
		
	}

}
