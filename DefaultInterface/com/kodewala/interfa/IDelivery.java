
  package com.kodewala.interfa;
  
  public interface IDelivery
  {
   double calculateCharge(double distance);
   
   public default void trackDelivery()
   {
    System.out.println("Tracking delivery...");
   }
  }
  
  class BikeDelivery implements IDelivery
  {
  @Override
   public double calculateCharge(double distance)
   {
   double fare = distance * 10;
   System.out.println("Bike Delivery charge: " + fare);
   return fare;
   }
  }
  
  class CarDelivery implements IDelivery
  {
   @Override
   public double calculateCharge(double distance)
   {
   double fare = distance * 20;
   System.out.println("Car Delivery charge: " + fare);
   return fare;
   }
  }
  
  
  class DeliverySystem
  {
   public static void main(String[] args)
  {
   BikeDelivery bike = new BikeDelivery();
   bike.calculateCharge(5);
   bike.trackDelivery();
   
   CarDelivery car = new CarDelivery();
   car.calculateCharge(5);
   car.trackDelivery();
  }
  }