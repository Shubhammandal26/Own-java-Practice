package com.kodewala.open;

public interface IPaymentService 
{
	void processPayment();

}

class CreditCard implements IPaymentService
{
	@Override
	public void processPayment() 
	{
	  System.out.println("Processing Credit Card Payment");
	}
}

class UPI implements IPaymentService
{
	@Override
	public void processPayment() 
	{
		System.out.println("Processing UPI Payment");
	}
}

class Wallet implements IPaymentService
{
	@Override
	public void processPayment()
	{
		System.out.println("Processing Wallet Payment");
	}
}

class PaymentServicess
{
	public void process(IPaymentService payment)
	{
		payment.processPayment();
	}
}
