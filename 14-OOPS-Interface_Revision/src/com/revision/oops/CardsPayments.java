package com.revision.oops;

public class CardsPayments implements IPayments
{

	@Override
	public void pay(double amount) 
	{
		System.out.println("Card Payment : " + amount);
	}
	@Override
	public void generateReceipt()
	{
		System.out.println("Generate Receipt...");
	}

}
