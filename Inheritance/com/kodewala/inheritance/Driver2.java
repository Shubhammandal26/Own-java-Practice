
   package com.kodewala.inheritance;
   
   class Order
   {
    int orderId;
	String customerName;
	double orderAmount;
	
	Order(int orderId, String customerName, double orderAmount)
	{
	this.orderId = orderId;
	this.customerName = customerName;
	this.orderAmount = orderAmount;
	}
	  public void displayOrderDetails()
	  {
	  System.out.println("Order ID: " + orderId);
	   System.out.println("Customer Name: " + customerName);
	    System.out.println("Order amount: " + orderAmount);
	  }
   }
   
   class ShippedOrder extends Order
   {
    String trackingNumber;
    String deliveryAddress;
	
	ShippedOrder(int orderId, String customerName, double orderAmount, String trackingNumber, String deliveryAddress)
	{
	 super(orderId, customerName, orderAmount);
	 this.trackingNumber = trackingNumber;
	 this.deliveryAddress = deliveryAddress;
	}
     
	 public void displayShippedOrderDetails()
	 {
	  super.displayOrderDetails();
	  System.out.println("Order Tracking Number: " + trackingNumber);
	  System.out.println("Delivery address: " + deliveryAddress);
	 }
   }
   
   class ExpressOrder extends ShippedOrder
   {
    int deliveryDays;
	double expressDeliveryCharge;
	
	ExpressOrder(int orderId, String customerName, double orderAmount, String trackingNumber, String deliveryAddress,
	int deliveryDays, double expressDeliveryCharge)
	{
	 super(orderId,customerName,orderAmount,trackingNumber,deliveryAddress);
	 this.deliveryDays = deliveryDays;
	 this.expressDeliveryCharge = expressDeliveryCharge;
	}
     
	 public void displayExpressOrderDetails()
	 {
	  super.displayShippedOrderDetails();
	  System.out.println("Delivery days: " + deliveryDays);
	  System.out.println("Express delivery charge: " + expressDeliveryCharge);
	 }
   }
   
   class Driver2
   {
    public static void main(String[] args)
   {
     ExpressOrder expressOrder = new ExpressOrder(501, "Shubham", 2499.0, "TRK12345", "Bengaluru", 1, 150.0);
	 expressOrder.displayExpressOrderDetails();
   }
   }