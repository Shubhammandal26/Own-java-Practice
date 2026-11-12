package com.revision.oops;

public class UPIPayments implements IPayments {

	@Override
	public void pay(double amount)
	{
		System.out.println("Pay amount: " + amount);
	}
}
