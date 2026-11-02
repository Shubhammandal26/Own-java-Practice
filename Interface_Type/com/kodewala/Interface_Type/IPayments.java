
   package com.kodewala.types;
   
   interface IPayments
   {
    boolean processPayment(double amount, String paymentMode);
   }
   
   class Payments
   {
   public static void main(String args[])
   {
    IPayments payment = (amount, paymentMode) ->
	{
		double fee;
		
	System.out.println("Original Amount: " + amount);
	System.out.println("Payment Mode: " + paymentMode);
	
	 if(paymentMode.equals("UPI"))
	 {
	  fee = 0;
	  
	 } else if(paymentMode.equals("CREDIT_CARD"))
	 {
	 fee = amount * 2/100;
	 
	 } else if(paymentMode.equals("DEBIT_CARD"))
	 {
	  fee = amount * 1/100;
	  
	 } else {
		 System.out.println("Invalid Payment Mode");
	 return false;
	 }
	 
	 double totalAmount = amount + fee;

            System.out.println("Processing Fee: " + fee);
            System.out.println("Total Amount: " + totalAmount);

            return true;
	};
   boolean result = payment.processPayment(5000, "CREDIT_CARD");
    System.out.println("Payment Status: " + result);
   }
   }