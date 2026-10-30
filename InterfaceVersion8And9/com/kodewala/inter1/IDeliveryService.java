

      package com.kodewala.inter1;
	  
	  interface IDeliveryService
	  {
	   void deliverOrder(String orderId);  // abstract method
	   
	    default  void trackOrder(String orderId)  // Default Method
		{
		log("Checking delivery service...");
		System.out.println("Tracking order: " + orderId);
		}
		
		static void checkDeliveryServiceStatus() // Static Method
		{
		 log("Delivery service is running");
		}
		
		private static void log(String message)  // Private Method
		{
		System.out.println("[DELIVERY LOG] " + message);
		}
	  }
	  
	  
	  class AmazonDelivery implements IDeliveryService
	  {
	   public void deliverOrder(String orderId)
	   {
	    System.out.println("Amazon delivery completed for: " + orderId);
	   }
	  }
	  
	   class FlipkartDelivery implements IDeliveryService
	  {
	   public void deliverOrder(String orderId)
	   {
	    System.out.println("Flipkart delivery completed for: " + orderId);
	   }
	  }
	  
	  class DeliveryApp
	  {
	  public static void main(String[] args)
	  {
	  IDeliveryService.checkDeliveryServiceStatus();
	  
	  IDeliveryService  amazon= new AmazonDelivery();
	  amazon.trackOrder("ORD101");
	  amazon.deliverOrder("ORD101");
	  
	  
	  IDeliveryService flipkart = new FlipkartDelivery();
	  flipkart.trackOrder("ORD102");
	  flipkart.deliverOrder("ORD102");
	   
	  
	  }
	  }
	  
	  
	  
	  