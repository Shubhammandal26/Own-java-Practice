package com.kodewala.single;

public class OnlineOrder {

	public static void main(String[] args)
	{
		OrderService service = new OrderService();
		service.calculateTotal(100, 10);
		
		OrderSave save = new OrderSave();
		save.saveOrder("ORD123");
		
		SendingEmail email = new SendingEmail();
		email.sendConfirmationEmail("rahul@gmail.com");

	}

}
