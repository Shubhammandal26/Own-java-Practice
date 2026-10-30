
 
    package com.kodewala.inter1;
	
	interface PaymentGateway
	{
	 default void validateTransaction()  // Default Method
	 {
		 log("Validating transaction...");
	  System.out.println("Transaction validated!");
	 }
	 
	 static void checkServiceStatus()   // Static Method
	 {
	 log("Payment service is active");
	 }
	 
	 private static void log(String message)  // Private Method
	 {
	 System.out.println("[LOG] " + message);
	 }
	 
	 void processPayment(double amount);
	}
	
	class CreditCardPayment implements PaymentGateway
	{
	  public void processPayment(double amount)
	  {
          System.out.println("Paid ₹ " + amount + " via Credit Card");	  
	  }
	}
	
	class UPIPayment implements PaymentGateway
	{
	 public void processPayment(double amount)
	 {
	  System.out.println("Paid ₹ " + amount + " via UPI.");
	 }
	}
	
	class PaymentApp
	{
	 public static void main(String[] args)
	{
	 PaymentGateway.checkServiceStatus();
	 
	 PaymentGateway cc = new CreditCardPayment();
	 cc.validateTransaction();
	 cc.processPayment(5000);
	 
	 PaymentGateway upi = new UPIPayment();
	 upi.validateTransaction();
	 upi.processPayment(1500);
	
	}
	}