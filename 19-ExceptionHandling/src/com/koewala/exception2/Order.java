package com.koewala.exception2;

public class Order {

	public static void main(String[] args) 
	{
		OrderService service = new OrderService();
		int result = service.calculateOrderAmount();
		System.out.println("Final : " + result);

	}

}
