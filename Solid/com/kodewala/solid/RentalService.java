
     package com.kodewala.solid;
	 
	 class Vehicle 
	 {
	 public void calculateRent(int days)
	 {
	 System.out.println("Calculating general vehicle rent...");
	 }
	 }
	 
	 class Bike extends Vehicle 
	 {
		 double totalCost = 0;
	 @Override
	 public void calculateRent(int days)
	 {
		 totalCost = days * 500;
	 System.out.println("Bike rental cost: " + totalCost);
	 }
	 }
	 
	 class Car extends Vehicle 
	 {
		 double totalCost = 0;
	 @Override
	 public void calculateRent(int days)
	 {
		 totalCost = days * 1500;
	 System.out.println("Car rental cost: " + totalCost);
	 }
	 }
	 
	 class RentalService 
	 {
	 public static void main(String[] args)
	 {
	 Vehicle vehicle = new Bike();
	 vehicle.calculateRent(3);
	 
	 Vehicle carVehicle = new Car();
	 
	 
	 if(carVehicle instanceof Car)
	 {
	  Car car = (Car) carVehicle;
	  car.calculateRent(2);
	 }
	 }
	 }
	 
	 
	 
	 