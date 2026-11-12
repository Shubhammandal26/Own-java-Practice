package com.revision.oops;

public class CreditCardPayment implements IPayment  
{

	@Override
	public void pay(double amount) {
		System.out.println("Credit card payment: Rs. " + amount );
	}

	@Override
	public void checkPaymentStatus() 
	{
		System.out.println("Credit Card Payment successful");
	}

}
