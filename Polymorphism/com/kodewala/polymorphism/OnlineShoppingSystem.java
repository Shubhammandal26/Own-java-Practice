
   package com.kodewala.polymorphism;
   
   class Order
   {
    public void processOrder()
	{
	System.out.println("Processing general order...");
   }
   }
   
   class ExpressOrder extends Order
   {
   @Override
    public void processOrder()
	{
	System.out.println("Processing express order...");
   }
   public void trackDelivery()
   {
    System.out.println("Tracking express delivery...");
   }
   }
   
   class OnlineShoppingSystem
   {
    public static void main(String[] args)
   {
       Order order = new ExpressOrder();  // upcasting
	   order.processOrder();
	   
	   if(order instanceof ExpressOrder)
	   {
		   ExpressOrder expressOrder = (ExpressOrder) order; // downcasting
		   expressOrder.trackDelivery(); 
	   }
   
   }
   }
    