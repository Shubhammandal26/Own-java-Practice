

    package com.kodewala.inter2;
	
	interface IOrderPayment
	{
	 void processPayment(double amount);
	 
	 private void validateAmount(double amount)
	 {
	  System.out.println("Validate Amount: " + amount);
	 }
	 
	 private void generateTransactionId()
	 {
	 System.out.println("Generating Transaction Id");
	}
	
	default void makePayment(double amount)
	{
	 System.out.println("Making Payment: " + amount);
	 validateAmount(amount);
	 generateTransactionId();
	}
	}
	
	class AmazonPayment implements IOrderPayment
	{
	 public void processPayment(double amount)
	 {
	  System.out.println("Processing Payment of amount: " + amount);
	 }
	}
	
	class OrderPayment
	{
	 public static void main(String[] args)
	{
	 AmazonPayment payment = new AmazonPayment();
	 payment.processPayment(1500);
	 payment.makePayment(2000);
	 
	}
	}