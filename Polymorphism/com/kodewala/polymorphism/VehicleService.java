
   package com.kodewala.polymorphism;
   
   class Vehicles
   {
    public void startEngine()
	{
	System.out.println("Vehicle engine started...");
   }
   }
   
   class MotorCycle extends Vehicles
   {
   @Override
    public void startEngine()
	{
	System.out.println("MotorCycle engine started...");
   }
   public void displayEngineCapacity()
   {
    System.out.println("Engine capacity: 150cc...");
   }
   }
   
   class VehicleService
   {
    public static void main(String[] args)
   {
       Vehicles vehicle = new MotorCycle(); // upcasting
	   vehicle.startEngine();
	   
	   if(vehicle instanceof MotorCycle)
	   {
		   MotorCycle cycle = (MotorCycle) vehicle; // downcasting
		   cycle.displayEngineCapacity();
	   }
   
   }
   }
  