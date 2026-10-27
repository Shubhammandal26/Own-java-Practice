
   package com.kodewala.solid;
   
    class OrderDeliver
	{ 
	 public static void main(String[] args)
	{
	 DeliveryProcess deliveryProcess = new DeliveryProcess();
	 deliveryProcess.processDelivery(new ExpressBee());
	 
	  deliveryProcess.processDelivery(new Ekart());
	  
	   deliveryProcess.processDelivery(new Minutes());
	}
	}