package com.revision.oops;

public class Payments {

	public static void main(String[] args) 
	{
		IPayments upi = new UPIPayments();
		upi.pay(1500);
		upi.generateReceipt();
		
		IPayments cp = new CardsPayments();
		cp.pay(1000);
		cp.generateReceipt();

	}

}
