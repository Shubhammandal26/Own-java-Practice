
    package com.kodewala.overriding;
	
	class Vehicle
	{
	 public void calculateRent()
	 {
	 System.out.println("Vehicle rental calculation");
	 }
	}
	
	class Car extends Vehicle
	{
	@Override
	public void calculateRent()
	{
	System.out.println("Car rental calculation");
	}
	}
	
	class Bike extends Vehicle
	{
	@Override
	 public void calculateRent()
	 {
	 System.out.println("Bike rental calculation");
	 }
	}
	
	class VehicleRental
	{
	public static void main(String[] args)
	{
	 Vehicle vehicle = new Vehicle();
	 vehicle.calculateRent();
	 
	 Car car = new Car();
	 car.calculateRent();
	 
	 Bike bike = new Bike();
	 bike.calculateRent();
	 
	 
	}
	}