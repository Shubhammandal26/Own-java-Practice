
   package com.kodewala.polymorphism;
   
   class Payment
   {
    public void pay()
	{
	System.out.println("Processing general payment...");
	}
   }
   
   class UPIPayment extends Payment
   {
   @Override
    public void pay()
   {
   System.out.println("Processing UPI payment");
   }
   public void checkUPIStatus()
   {
   System.out.println("UPI payment status: Sucessful");
   }
   }
   
   class PaymentDriver 
   {
   public static void main(String[] args)
   {
    Payment payment = new UPIPayment();
	payment.pay();
	
	if(payment instanceof UPIPayment)
	{
	 UPIPayment upi = (UPIPayment) payment;
	 upi.checkUPIStatus();
	}
   }
   }