

    package com.kodewala.polymorphism;
	
	class OrderManagementSystem
	{
	 public static void main(String[] args)
	{
	  OrderService orderService = new OrderService();
	  
	  OnlineOrder online = new OnlineOrder();
	  orderService.process(online);
	  
	  StorePickupOrder store = new StorePickupOrder();
	  orderService.process(store);
	  
	  ExpressOrder expressOrder = new ExpressOrder();
	  orderService.process(expressOrder);
	  
	  InternationalOrder international = new InternationalOrder();
	  orderService.process(international);
	
	}
	}