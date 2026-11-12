package com.revision.oops;

public class OnlineOrder implements IOrder
{
	@Override
	public void placeOrder(double amount) 
	{
		System.out.println("Order amount: " + amount);
		
	}

}
