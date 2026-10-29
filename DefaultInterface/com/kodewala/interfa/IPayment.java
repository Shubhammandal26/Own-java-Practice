

  package com.kodewala.interfa;
  
   public interface IPayment
   {
    void processPayment(double amount);
	
	public default void showPaymentStatus()
	{
	System.out.println("Payment processing completed");
	}
   }
   
   class UPIPayment implements IPayment
   {
    @Override
	public void processPayment(double amount)
   {
   System.out.println("Processing UPI payment: " + amount);
   }
   
   }
   
   class CardPayment implements IPayment
   {
    @Override
	public void processPayment(double amount)
   {
   System.out.println("Processing Card payment: " + amount);
   }
   }
   
   class PaymentService
   {
    public void pay(IPayment payment, double amount)
	{
	 payment.processPayment(amount);
	 payment.showPaymentStatus();
	}
   }
   
   class PaymentSystem
   {
   public static void main(String[] args)
   {
    PaymentService paymentService = new PaymentService();
	paymentService.pay(new UPIPayment(), 1500);
	paymentService.pay(new CardPayment(), 2500);
   }
   }