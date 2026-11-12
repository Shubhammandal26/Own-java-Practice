package com.revision.oops;

public interface IPayments 
{
	void pay(double amount);
	
	public default void generateReceipt()
	{
		System.out.println("Generating Payment receipt...");
	}

}
