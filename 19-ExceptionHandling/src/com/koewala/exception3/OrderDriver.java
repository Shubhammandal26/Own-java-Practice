package com.koewala.exception3;

public class OrderDriver {

	public static void main(String[] args) 
	{
		OrderService service = new OrderService();
		try {
			service.placeOrder("ORD104", "Mouse", 0);
			
		} catch (InvalidOrderQuantityException e) {
			System.out.println(e.getMessage());
			
		} catch (OutOfStockException e) 
		{
			System.out.println(e.getMessage());
		}
        System.out.println("Order processing completed");
	}

}
