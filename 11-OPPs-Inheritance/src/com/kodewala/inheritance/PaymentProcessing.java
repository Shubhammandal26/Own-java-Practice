package com.kodewala.inheritance;

class Payment
{
	public void processPayment(double amount)
	{
		System.out.println("Payment Processing: " + amount);
	}
}

class CreditCardPayment extends Payment
{
	public void processPayment(double amount)
	{
		System.out.println("Payment Processing via Credit Card: " + amount);
	}
}

class UPIPayment extends Payment
{
	@Override
	public void processPayment(double amount)
	{
		System.out.println("Payment Processing via UPI: " + amount);
	}
}

class NetBankingPayment extends Payment
{
	@Override
	public void processPayment(double amount)
	{
		System.out.println("Payment Processing via Net Banking: " + amount);
	}
}
public class PaymentProcessing {

	public static void main(String[] args) 
	{
		Payment cc = new CreditCardPayment();
		cc.processPayment(1200);
		
		Payment upi = new UPIPayment();
		upi.processPayment(1500);
		
		Payment net = new NetBankingPayment();
		net.processPayment(2000);

	}

}
