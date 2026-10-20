
  package com.kodewala.overloading;
  
  class VehicleRentalSystem
  {
  public void calculateRent(double dailyRate)
  {
  System.out.println("Rate : " + dailyRate);
  }
  
   public void calculateRent(double dailyRate, int days)
  {
    double totalDailyRate = dailyRate * days;
   System.out.println("Total Daily Rate: " + totalDailyRate);
   System.out.println("Days: " + days);
  }
  
   public void calculateRent(double dailyRate, int days, double insuranceFee)
  {
    double totalRent = dailyRate * days + insuranceFee;

System.out.println("Daily Rate: " + dailyRate);
System.out.println("Days: " + days);
System.out.println("Insurance Fee: " + insuranceFee);
System.out.println("Total Rent: " + totalRent);
  }
  }
  
  class RentalSystem
  {
   public static void main(String[] args)
  {
   VehicleRentalSystem system = new VehicleRentalSystem();
   system.calculateRent(1000);
   system.calculateRent(1000, 3);
   system.calculateRent(1000, 3, 500);
  }
  }