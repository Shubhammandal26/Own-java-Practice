package com.koewala.exception3;

public class OrderService 
{
	public boolean placeOrder(String orderId, String productName,int quantity) throws InvalidOrderQuantityException, OutOfStockException
	{
		if(quantity <= 0)
		{
			throw new InvalidOrderQuantityException("Invalid order quantity");
		} 
		if(quantity > 10)
		{
			throw new OutOfStockException("Out of stock");
		}
		return true;
	}

}
