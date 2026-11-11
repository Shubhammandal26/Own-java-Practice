package com.revision.oops;

class Payment
{
	void processPayment()
	{
		System.out.println("Payment Processing...");
	}
}

class CreditCard extends Payment
{
	@Override
	void processPayment()
	{
		System.out.println("Payment Processing via Credit Card...");
	}
}

class UPI extends Payment
{
	@Override
	void processPayment()
	{
		System.out.println("Payment Processing via UPI...");
	}
}

class Wallet extends Payment
{
	@Override
	void processPayment()
	{
		System.out.println("Payment Processing via Wallet...");
	}
}
public class PaymentSystem {

	public static void main(String[] args) 
	{
		Payment payment = new CreditCard();
		CreditCard cc = (CreditCard) payment;
		cc.processPayment();
		
		Payment payment1 = new UPI();
		UPI upi = (UPI) payment1;
		upi.processPayment();
		
		Payment payment2 = new Wallet();
		Wallet wallet = (Wallet) payment2;
		wallet.processPayment();

	}

}
