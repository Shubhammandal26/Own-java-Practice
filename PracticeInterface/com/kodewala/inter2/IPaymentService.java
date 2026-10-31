

    package com.kodewala.inter2;
	
	interface IPaymentService
	{
	void processPayment(double amount);
	
	public default void receipt()
	{
	 System.out.println("Payment receipt generated");
	}
	}
	
	class CreditCardPayment implements IPaymentService
	{
	 public void processPayment(double amount)
	 {
	 System.out.println("Processing Payment using Credit Card: " + amount);
	 }
	 
	 @Override
	 public void receipt()
	 {
	  System.out.println("Credit Card Payment receipt generated");
	 }	
	}
	
	class UPIPayment implements IPaymentService
	{
	 public void processPayment(double amount)
	 {
	 System.out.println("Processing Payment using UPI: " + amount);
	 }
	 }
	 
	 class PaymentService
	 {
	  public static void main(String[] args)
	 {
	 CreditCardPayment cc = new CreditCardPayment();
	 cc.processPayment(1000);
	 cc.receipt();
	 
	 UPIPayment upi = new UPIPayment();
	 upi.processPayment(1500);
	 
	 }
	 }