
  package com.kodewala.interfa;
  
  public interface IOrderDelivery 
  {
    public abstract double calculateDeliveryFee(double distance);
	
	public default void showDeliveryStatus()
	{
	System.out.println("Your order is on the way!");
	}
  
  }
  
  class BikeOrderDelivery implements IOrderDelivery
  {
  @Override
  public double calculateDeliveryFee(double distance)
  {
   double fare = distance * 8;
   System.out.println("Bike Delivery fee: " + fare);
   return fare;
  }
  }
  
  class TruckOrderDelivery implements IOrderDelivery
  {
  @Override
  public double calculateDeliveryFee(double distance)
  {
   double fare = distance * 15;
   System.out.println("Truck Delivery fee: " + fare);
   return fare;
  }
  }
  
  class DeliveryService
  {
	  public void processDelivery(IOrderDelivery delivery, double distance)
	  {
		  delivery.calculateDeliveryFee(distance);
		  delivery.showDeliveryStatus();
	  }
  }
  
  class FoodOrderSystem
  {
   public static void main(String[] args)
  {
   DeliveryService deliveryService = new DeliveryService();
   deliveryService.processDelivery(new BikeOrderDelivery(), 6);
   deliveryService.processDelivery(new TruckOrderDelivery(), 6);
   
  
  }
  }
  
  