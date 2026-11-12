package com.revision.oops;

public class Order {

	public static void main(String[] args)
	{
		double amount = 500;
		
		if(IOrder.isValidAmount(amount))
		{
		IOrder order = new OnlineOrder();
		order.placeOrder(amount);
		}

	}

}
