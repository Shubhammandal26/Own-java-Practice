
    package com.kodewala.polymorphism;
	
	class VehicleRentalSystem
	{
	  public static void main(String[] args)
	{
	 RentalService rentalService = new RentalService();
	 
	 Car car = new Car();
	 rentalService.rentVehicle(car);
	 
	 MotorCycle motorCycle = new MotorCycle();
	 rentalService.rentVehicle(motorCycle);
	 
	 Truck truck = new Truck();
	 rentalService.rentVehicle(truck);
	 
	 Bus bus = new Bus();
	 rentalService.rentVehicle(bus);
	
	}
	}