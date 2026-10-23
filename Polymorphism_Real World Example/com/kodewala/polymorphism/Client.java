   package com.kodewala.polymorphism;
   
   public class Client 
{
	public static void main(String[] args) 
	{
	PaymentProcessor paymentProcessor = new PaymentProcessor();
	
	// for the user#1, he/she selected payment method as a Credit Card
	CreditCardPayment creditPayment = new CreditCardPayment();
	paymentProcessor.processPayment(creditPayment);
	
	// for the user#1, he/she selected payment method as a NetBanking Card
	  NetBankingPayment netBanking = new NetBankingPayment();
	  paymentProcessor.processPayment(netBanking);
	  
	  
	  UPIPayment upiPayment = new UPIPayment();
	  paymentProcessor.processPayment(upiPayment);
	
	}

}
