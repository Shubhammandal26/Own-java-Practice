
  package com.kodewala.revision;
  
  class Order
  {
  public void processOrder()
  {
   System.out.println("Processing order...");
  }
  }
  
  class HomeDelivery extends Order
  {
  @Override
  public void processOrder()
  {
   System.out.println("Processing home delivery order...");
  }
  public void trackDelivery()
  {
   System.out.println("Tracking home delivery....");
  }
  }
  
  class StorePickUpOrder extends Order
  {
  @Override
  public void processOrder()
  {
   System.out.println("Processing store pickup order");
  }
  public void showPickUpLocation()
  {
   System.out.println("Pickup location: Main Street Store");
  }
  }
  
  class OnlineOrderProcessing
  {
   public static void main(String[] args)
  {
   Order order1 = new HomeDelivery();
   order1.processOrder();
   
   Order order2 = new StorePickUpOrder();
   order2.processOrder();
   
   if(order1 instanceof HomeDelivery)
   {
    HomeDelivery home = (HomeDelivery) order1;
	home.trackDelivery();
   }
   
   if(order2 instanceof StorePickUpOrder)
   {
   StorePickUpOrder store = (StorePickUpOrder) order2;
    store.showPickUpLocation();
   }
  }
  }