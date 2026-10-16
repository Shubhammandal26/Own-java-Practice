
   package com.kodewala.inheritance_type;
   
   class Vehicle
  {
   String brand;
   String registrationNumber;
   double rentalPrice;
   
    Vehicle(String brand, String registrationNumber, double rentalPrice)
   {
    this.brand = brand;
	this.registrationNumber = registrationNumber;
	this.rentalPrice = rentalPrice;
   }
   public void displayVehicleDetails()
   {
    System.out.println("Vehicle Brand: " + brand);
	System.out.println("vehicle Registration Number : " + registrationNumber);
	System.out.println("Rental Price: " + rentalPrice);
   }
  }
  
  class Car extends Vehicle
  {
    int numberOfSeats;
	boolean hasAC;
	
	Car(String brand, String registrationNumber, double rentalPrice, int numberOfSeats, boolean hasAC)
	{
	 super(brand, registrationNumber, rentalPrice);
	 this.numberOfSeats = numberOfSeats;
	 this.hasAC = hasAC;
	}
  
     public void displayCarDetails()
	 {
	   super.displayVehicleDetails();
	   System.out.println("Number of seats: " + numberOfSeats);
	   System.out.println("Has AC: " + hasAC);
	 }
  }
  
  class Bike extends Vehicle
  {
     int engineCC;
	 boolean hasHelmet;
	 
	 Bike(String brand, String registrationNumber, double rentalPrice,
	 int engineCC, boolean hasHelmet)
	 {
	   super(brand, registrationNumber, rentalPrice);
	   this.engineCC = engineCC;
	   this.hasHelmet = hasHelmet;
	 }
	 
	 public void displayBikeDetails()
	 {
       super.displayVehicleDetails();
	   System.out.println("Engine CC: " + engineCC);
	   System.out.println("Has Helmet: " + hasHelmet);
      }
  }
  
  class VehicleRentalManagementSystem
  {
    public static void main(String[] args)
  {
    Car car = new Car("Toyota", "KA03AB1234", 2500.0, 5, true);
	car.displayCarDetails();
	
	Bike bike = new Bike("Royal Enfield", "KA05XY5678", 800.0, 350, true);
	bike.displayBikeDetails();
  }
  }