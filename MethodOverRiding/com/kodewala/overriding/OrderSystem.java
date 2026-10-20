
    package com.kodewala.overriding;
	
	class Order
	{
	 public void processOrder()
	 {
	 System.out.println("Processing general order");
	 }
	}
	
	class OnlineOrder extends Order
	{
	@Override
	public void processOrder()
	{
	System.out.println("Processing online order and arranging delivery.");
	}
	}
	
	class StorePickupOrder extends Order
	{
	@Override
	 public void processOrder()
	 {
	 System.out.println("Processing store pickup order and preparing collection");
	 }
	}
	
	class OrderSystem
	{
	public static void main(String[] args)
	{
	 Order order = new Order();
	 order.processOrder();
	 
	 OnlineOrder online = new OnlineOrder();
	 online.processOrder();
	 
	 StorePickupOrder store = new StorePickupOrder();
	 store.processOrder();
	}
	}