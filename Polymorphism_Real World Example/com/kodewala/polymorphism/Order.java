
   package com.kodewala.polymorphism;
   
   class Order
   {
   public void processOrder()
   {
   System.out.println("Order processing.....");
   }
   }
   
   class OnlineOrder extends Order
   {
   @Override
   public void processOrder()
   {
   System.out.println("Processing online order...");
   }
   }
   
   class StorePickupOrder extends Order
   {
   @Override
   public void processOrder()
   {
   System.out.println("Processing store pick up order...");
   }
   }
   
   class ExpressOrder extends Order
   {
   @Override
   public void processOrder()
   {
   System.out.println("Processing express order...");
   }
   }
   
   
   class InternationalOrder extends Order
   {
   @Override
   public void processOrder()
   {
   System.out.println("Processing international order...");
   }
   }
   
   