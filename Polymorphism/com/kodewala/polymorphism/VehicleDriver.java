

   package com.kodewala.polymorphism;
   
   class Vehicle
   {
    public void rent()
	{
	System.out.println("Renting a general vehicle...");
   }
   }
   
   class Car extends Vehicle
   {
   @Override
    public void rent()
	{
	System.out.println("Renting a car...");
   }
   public void displaySeats()
   {
    System.out.println("Car has 5 seats");
   }
   }
   
   class VehicleDriver
   {
    public static void main(String[] args)
   {
    Vehicle vehicle = new Car();
	vehicle.rent();
	
	if(vehicle instanceof Car)
	{
		Car car = (Car)vehicle;
		car.displaySeats();
	}
   
   }
   }