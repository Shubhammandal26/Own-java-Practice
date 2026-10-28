
   package com.kodewala.inter;
   
    class PaymentServicess
	{
	 public void pays(IPayments payment, double amount)
	 {
	  if(payment.validatePayment(amount))
	  {
		   payment.processPayment(amount);
	 } else {
	 System.out.println("Invalid payment amount");
	 }
	  }
	 
	 public static void main(String[] args)
	{
	 PaymentServicess paymentServicess = new PaymentServicess();
	 paymentServicess.pays(new CreditCardPayments(), 120);
	 paymentServicess.pays(new UPIPayments(), 100);
	
	}
	}