

    package com.kodewala.inter1;
	
	interface IFoodPayment
	{
	 
	 void processPayment(double amount);
	 
	 default void validatePayment(double amount)
	 {
	  if(amount > 0)
	  {
	  log("Payment Validate...");
	    System.out.println("Validate Payment: " + amount);
	  }
	 }
	 
	 static void checkPaymentGateway()
	 {
	  System.out.println("Payment Gateway is Active");
	 }
	 
	private static void log(String message)
	 {
	  System.out.println("[PAYMENT LOG]: " + message);
	 }
	}
	
	class UPIPayments implements IFoodPayment
	{
	 public void processPayment(double amount)
	{
	 System.out.println("Processing payment using UPI: " + amount);
	}
	}
	
	class CreditCardPayments implements IFoodPayment
	{
	 public void processPayment(double amount)
	{
	 System.out.println("Processing payment using Credit Card: " + amount);
	}
	}
	
	class FoodDeliverys
	{
	public static void main(String[] args)
	{
	 IFoodPayment.checkPaymentGateway();
	 
	 IFoodPayment upi = new UPIPayments();
	 upi.validatePayment(500);
	 upi.processPayment(500);
	 
	 IFoodPayment cc = new CreditCardPayments();
	 cc.validatePayment(1000);
	 cc.processPayment(1000);
	 
	}
	}