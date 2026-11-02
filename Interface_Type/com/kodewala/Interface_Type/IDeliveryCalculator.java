
   package com.kodewala.types;
   
   interface IDeliveryCalculator
   {
   double calculateDeliveryCharge(double orderAmount, int distance);
   }
   
   class DeliveryCharge
   {
   public static void main(String[] args)
   {
    IDeliveryCalculator delivery = (orderAmount, distance) ->
	{
	 System.out.println("Order Amount: " + orderAmount);
	  System.out.println("Delivery Distance: " + distance + "km");
	  
	 if(orderAmount >= 5000)
	 {
	  return 0;
	 } else if(distance <= 5)
	 {
	  return 50;
	 } else if(distance <= 10) {
	    return 100;
     } else {
	 return 200;
	 }
	};
	 double charge = delivery.calculateDeliveryCharge(3000, 8);
	 System.out.println("Delivery Charge: " + charge);
   }
   }