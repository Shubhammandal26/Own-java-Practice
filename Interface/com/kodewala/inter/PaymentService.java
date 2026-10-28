
   package com.kodewala.inter;
   
   class PaymentService
   {
	 public void processPayment(IPayment payment, double amount)
	 {
		 payment.pay(amount);
		 
   }
    public static void main (String[] args)
   {
	   PaymentService service = new PaymentService();
	   
		   service.processPayment(new UpiPayment(), 1500);
          service.processPayment(new CreditCardPayment(), 2500);   
   
   }
   }