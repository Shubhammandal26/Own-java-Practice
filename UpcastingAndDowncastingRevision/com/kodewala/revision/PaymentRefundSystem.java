
    package com.kodewala.revision;
	
	class Payment
	{
	 public void processRefund()
	 {
	 System.out.println("Payment is processing....");
	 }
	}
	
	class CreditCardPayment extends Payment
	{
	@Override
	public void processRefund()
	 {
	 System.out.println("Processing credit card refund...");
	 }
	 public void showTransactionDetails()
	 {
		 System.out.println("Showing credit card transaction details...");
	 }
	}
	
	class UPIPayment extends Payment
	{
	@Override
	public void processRefund()
	 {
	 System.out.println("Processing UPI refund...");
	 }
	 public void showTransactionDetails()
	 {
		 System.out.println("Showing UPI transaction details...");
	 }
	}
	
	class PaymentRefundSystem
	{
	public static void main(String[] args)
	{
	 Payment payment1 = new CreditCardPayment();
	 payment1.processRefund();
	 
	 // Upcasting for UPI
	 Payment payment2 = new UPIPayment();
	 payment2.processRefund();
	 
	 // Downcasting for Credit card
	 if(payment1 instanceof CreditCardPayment)
	 {
	CreditCardPayment cc = (CreditCardPayment) payment1;
	cc.showTransactionDetails();
	 }
	 
	 // Downcasting for Credit card
	 
	 if(payment2 instanceof UPIPayment)
	 {
		 UPIPayment upi = (UPIPayment) payment2;
		 upi.showTransactionDetails();
	 }
	 
	}
	}