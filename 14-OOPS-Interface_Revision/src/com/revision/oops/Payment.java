package com.revision.oops;

public class Payment {

	public static void main(String[] args) 
	{
		IPayment cc = new CreditCardPayment();
		cc.pay(2500);
		cc.checkPaymentStatus();
		
		IPayment upi = new UPIPayment();
		upi.pay(1500);
		upi.checkPaymentStatus();
		
		IPayment dc = new DebitCardPayment();
		dc.pay(3000);
		dc.checkPaymentStatus();

	}

}
