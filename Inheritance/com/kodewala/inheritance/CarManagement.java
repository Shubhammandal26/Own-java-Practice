
   package com.kodewala.inheritance;
   
   class Vehicle
   {
   String brand;
   String model;
   
    Vehicle(String brand, String model)
	{
	 this.brand = brand;
	 this.model = model;
	}
	
	public void displayVehicleDetails()
	{
	 System.out.println("Car Brand : " + brand);
	  System.out.println("Car Model : " + model);
	}
   }
   
   class Car extends Vehicle
   {
    int numberOfDoors;
	
	Car(String brand, String model, int numberOfDoors)
	{
	  super(brand, model);
	  this.numberOfDoors = numberOfDoors;
	}
    
	public void displayCarDetails(){
	 super.displayVehicleDetails();
	 System.out.println("Number of Doors: " + numberOfDoors);
	}
   }
   
   class LuxuryCar extends Car 
   {
    boolean hasSunroof;
	
	LuxuryCar(String brand, String model, int numberOfDoors, boolean hasSunroof)
	{
	  super(brand,model,numberOfDoors);
	  this.hasSunroof = hasSunroof;
	}
      
	  public void displayLuxuryCarDetails()
	  {
	   super.displayCarDetails();
	   System.out.println("Has Sunroof: " + hasSunroof);
	  }
   }
   
   class CarManagement
   {
    public static void main(String[] args)
   {
     LuxuryCar luxury = new LuxuryCar("BMW", "5 Series", 4, true);
	 luxury.displayLuxuryCarDetails();
   
   }
   }