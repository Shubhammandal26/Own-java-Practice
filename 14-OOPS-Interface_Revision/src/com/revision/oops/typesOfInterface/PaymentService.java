package com.revision.oops.typesOfInterface;

public class PaymentService {

	public static void main(String[] args)
	{
		IPaymentProcessor cc = amount -> {
			System.out.println("Processing Credit Card Payment of $: " + amount);
			return true;
		};
         boolean status = cc.processPayment(250);
         System.out.println("Payment successful: " + status);
	}
}
