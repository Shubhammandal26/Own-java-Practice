 package com.kodewala.solid;
 
 class Delivery
 {
  public void calculateCharge(double distance)
 {
  System.out.println("Calculating general delivery charge...");
 }
 }
 
 class BikeDelivery extends Delivery
 {
  double fair = 0;
  @Override
  public void calculateCharge(double distance)
  {
    fair = distance * 10;
	System.out.println("Bike delivery charge: " + fair);
  }
  
  public void showHelmateStatus(String status)
  {
   System.out.println("Helmate status: " + status);
  }
  }
  
  class CarDelivery extends Delivery
 {
  double fair = 0;
   @Override
  public void calculateCharge(double distance)
  {
    fair = distance * 20;
	System.out.println("Car delivery charge: " + fair);
  }
  
  public void showVehicleNumber(String carNumber)
  {
   System.out.println("Vehicle Number: " + carNumber);
  }
  }
  
  class DroneDelivery extends Delivery
 {
  double fair = 0;
  @Override
  public void calculateCharge(double distance)
  {
    fair = distance * 15;
	System.out.println("Drone delivery charge: " + fair);
  }
  }
  
  class DeliveryService 
  {
  public static void main(String[] args)
  {
   Delivery bike = new BikeDelivery();
   bike.calculateCharge(5);
   
   Delivery car = new CarDelivery();
   car.calculateCharge(8);
   
   if(car instanceof CarDelivery)
   {
	   CarDelivery carDelivery = (CarDelivery) car;
	   carDelivery.showVehicleNumber("KA01AB1234");
   }
   if (bike instanceof BikeDelivery) {
    BikeDelivery bikeDelivery = (BikeDelivery) bike;
    bikeDelivery.showHelmateStatus("Available");
    }
	
	Delivery drone = new DroneDelivery();
	drone.calculateCharge(4);
  }
  }