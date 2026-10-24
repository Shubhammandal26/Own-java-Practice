
  package com.kodewala.revision;
  
  class Vehicle
  {
  public void calculateRent()
  {
   System.out.println("Calculate vehicle rent...");
  }
  }
  
  class Car extends Vehicle
  {
   @Override
   public void calculateRent()
  {
   System.out.println("Calculating car rental cost....");
  }
  public void displaySeatingCapacity()
  {
  System.out.println("Car seating capacity: 5");
  }
  }
  
  class MotorCycle extends Vehicle
  {
   @Override
   public void calculateRent()
  {
   System.out.println("Calculating motorcycle rental cost....");
  }
  public void displayEngineCapacity()
  {
  System.out.println("Car engine capacity: 150cc");
  }
  }
  
  class VehicleRentalSystem
  {
   public static void main(String[] args)
  {
   Vehicle vehicle1 = new Car();
   vehicle1.calculateRent();
   
   Vehicle vehicle2 = new MotorCycle();
   vehicle2.calculateRent();
   
   if(vehicle1 instanceof Car)
   {
     Car car = (Car) vehicle1;
	 car.displaySeatingCapacity();
     }
	 
	 if(vehicle2 instanceof MotorCycle)
	 {
	  MotorCycle bike = (MotorCycle) vehicle2;
	  bike.displayEngineCapacity();
	 }
  }
  }