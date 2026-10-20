
    package com.kodewala.overriding;
	
  class Payment
	{
	 public void processPayment()
	 {
	 System.out.println("Processing general payment.");
	 }
	}
	
	class CreditCardPayment extends Payment
	{
	@Override
	public void processPayment()
	{
	System.out.println("Processing credit card payment");
	}
	}
	
	class UPIPayment extends Payment
	{
	@Override
	 public void processPayment()
	 {
	 System.out.println("Processing UPI payment.");
	 }
	}
	
	class PaymentSystem
	{
	public static void main(String[] args)
	{
	 Payment payment = new Payment();
	 payment.processPayment();
	 
	 CreditCardPayment creditCard = new CreditCardPayment();
	 creditCard.processPayment();
	 
	 UPIPayment upi = new UPIPayment();
	 upi.processPayment();
	}
	} 