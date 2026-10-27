
  package com.kodewala.solid;
  
  class PaymentType
  {
  public static void main(String[] args)
  {
    PaymentService service = new PaymentService();
	service.process(new CreditCardPayment());
	service.process(new UPIPayment());
	service.process(new Wallet());
//	service.process(new CreditCardPayment());
  
  }
  }