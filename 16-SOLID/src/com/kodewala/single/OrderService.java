package com.kodewala.single;

public class OrderService 
{
	public void calculateTotal(double price, int quantity)
	{
		double total = price * quantity;
		System.out.println("Total: " + total);
	}
  }
