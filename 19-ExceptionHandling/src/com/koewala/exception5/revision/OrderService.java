package com.koewala.exception5.revision;

public class OrderService 
{
	public void placeOrder(int availableStock, int quantity, double orderAmount) throws MinimumOrderAmountException
	{
		if(quantity <= 0)
		{
			throw new InvalidQuantityException("Invalid quantity");
			
		} else if(availableStock < quantity)
		{
			throw new ProductOutOfStockException("Product out of stock");
			
		} else if(orderAmount < 500)
		{
			throw new MinimumOrderAmountException("Minimum order amount not met");
	
		} else {
			System.out.println("Order placed successfully");
		}
	}

}
