

     package com.kodewala.inter1;
	 
	 interface IPayment
	 {
	  void processPayment(double amount);
	  
	  public default void validatePayment(double amount)
	  {
	  logPayment("Payment is getting validating...");
	  System.out.println("Validating Payment: " + amount);
	  }
	  
	  public static void checkPaymentGateway()
	  {
	   System.out.println("Checking payment gateway");
	  }
	 
	 private static void logPayment(String message)
	 {
	 System.out.println("[LOG]: " + message);
	 }
	 }
	 
	 class UpiPayment implements IPayment
	 {
	 @Override
	  public void processPayment(double amount)
	 {
	 System.out.println("Paying using UPI: "  + amount);
	 }
	 }
	 
	 class CreditcardPayment implements IPayment
	 {
	 @Override
	  public void processPayment(double amount)
	 {
	 System.out.println("Paying using Credit Card: "  + amount);
	 }
	 }
	 
	 class PaymentSystems
	 {
	  public static void main(String[] args)
	 {
	  IPayment.checkPaymentGateway();
	  
	  IPayment upi = new UpiPayment();
	  upi.processPayment(1500);
	  upi.validatePayment(100);
	  
	  IPayment credit = new CreditcardPayment();
	  credit.processPayment(1500);
	  credit.validatePayment(100);
	 
	 }
	 }
	 
	 
	 