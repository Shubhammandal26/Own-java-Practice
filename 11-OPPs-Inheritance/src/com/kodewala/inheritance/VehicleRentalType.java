package com.kodewala.inheritance;

class Vehicle
{
	private String vehicleNumber;
	private String brand;
	private double rentPerDay;
	
	public Vehicle(String vehicleNumber, String brand, double rentPerDay) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.brand = brand;
		this.rentPerDay = rentPerDay;
	}
	
	public void displayDetails() 
	{
		System.out.println("Vehicle Number: " + vehicleNumber);
		System.out.println("Vehicle Brand: " + brand);
		System.out.println("Vehicle Rent Per Day: " + rentPerDay);
	}
	
	public double getRentPerDay()
	{
		return rentPerDay;
	}
	
	public void calculateTotal(int days)
	{
		double total = days * rentPerDay;
		System.out.println("Total Rental Cost: " + total);
	}
}

class Car extends Vehicle
{
	int numberOfSeats;
	public Car(String vehicleNumber, String brand, double rentPerDay, int numberOfSeats) 
	{
		super(vehicleNumber, brand, rentPerDay);
		this.numberOfSeats = numberOfSeats;
	}
	
	@Override
	public void calculateTotal(int days)
	{
		double total = days * getRentPerDay();
		System.out.println("Total Rental Cost: " + total);
	}
	
	@Override
	public void displayDetails() 
	{
		super.displayDetails();
		System.out.println("Car Seat: " + numberOfSeats);
	}
}

class Bike extends Vehicle
{
   int engineCapacity;
	public Bike(String vehicleNumber, String brand, double rentPerDay, int engineCapacity) 
	{
		super(vehicleNumber, brand, rentPerDay);
		this.engineCapacity = engineCapacity;
	}
	@Override
	public void calculateTotal(int days)
	{
		double total = days * getRentPerDay();
		System.out.println("Total Rental Cost: " + total);
	}
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Bike Engine Capacity: " + engineCapacity);
	}
}

public class VehicleRentalType 
{

	public static void main(String[] args) 
	{
		Vehicle v = new Bike("KA05AB1234", "Honda", 70000, 250);
		v.calculateTotal(4);
		v.displayDetails();
		
		Vehicle car = new Car("KA01CD5623", "TATA", 90000, 5);
		car.calculateTotal(2);
		car.displayDetails();
		

	}

}
