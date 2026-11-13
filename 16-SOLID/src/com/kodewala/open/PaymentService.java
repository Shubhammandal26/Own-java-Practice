package com.kodewala.open;

public class PaymentService {

	public static void main(String[] args) 
	{
		PaymentServicess servicess = new PaymentServicess();
		servicess.process(new CreditCard());
		servicess.process(new UPI());
		servicess.process(new Wallet());
	}
}
