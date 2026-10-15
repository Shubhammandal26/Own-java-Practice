 
 
   package com.kodewala.inheritance;
   
   class VehicleManagementSystem
   {
   public static void main(String[] args)
   {
     PremiumRental rental = new PremiumRental("KA03AB1234", "Toyota", 5, 2000.0, 500.0, 1000.0);
	 rental.displayPremiumRentalDetails();
   }
   }
   
   class Vehicles 
   {
    String vehicleNumber;
	String brand;
	Vehicles(String vehicleNumber, String brand)
	{
	this.vehicleNumber = vehicleNumber;
	this.brand = brand;
	}
	public void displayVehicleDetails()
	{
	 System.out.println("Vehicle Number: " + vehicleNumber);
	 System.out.println("Brand: " + brand);
	}
   }
   
   class RentalVehicle extends Vehicles
   {
     int rentalDays;
	 double pricePerDay;
	 
	 RentalVehicle(String vehicleNumber, String brand, int rentalDays, double pricePerDay)
	 {
	   super(vehicleNumber, brand);
	   this.rentalDays = rentalDays;
	   this.pricePerDay = pricePerDay;
	 }
	 public void displayRentalDetails()
	 {
	   super.displayVehicleDetails();
	   System.out.println("Rental Days: " + rentalDays);
	   System.out.println("Price Per Day: " + pricePerDay);
	 }
   }
   
   class PremiumRental extends RentalVehicle
   {
     double insuranceCharge;
	 double discount;
	
	PremiumRental(String vehicleNumber, String brand, int rentalDays, double pricePerDay,double insuranceCharge, double discount)
	{
	  super(vehicleNumber, brand, rentalDays, pricePerDay);
	  this.insuranceCharge = insuranceCharge;
	  this.discount = discount;
	}
	public void displayPremiumRentalDetails()
	{
	   super.displayRentalDetails();
	   System.out.println("Insurance Charge: " + insuranceCharge);
	   System.out.println("Discount: " + discount);
   }
   }