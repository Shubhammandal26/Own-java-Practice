
   package com.kodewala.polymorphism;
   
   class Vehicle
   {
   public void calculateRentalSystem()
   {
    System.out.println("Calculating vehicle rent cost....");
   }
   }
   
   class Car extends Vehicle
   {
   @Override
    public void calculateRentalSystem()
   {
   System.out.println("Calculating car rental cost...");
   }
   }
   
   class MotorCycle extends Vehicle
   {
   @Override
    public void calculateRentalSystem()
   {
   System.out.println("Calculating motorcycle rental cost...");
   }
   }
   
   class Truck extends Vehicle
   {
   @Override
    public void calculateRentalSystem()
   {
   System.out.println("Calculating truck rental cost...");
   }
   }
   
   class Bus extends Vehicle
   {
   @Override
    public void calculateRentalSystem()
   {
   System.out.println("Calculating bus rental cost...");
   }
   }
   
   