
  package com.kodewala.oops;
  
  class Electricity
  {
   private String customerName;
   private int unitsConsumed;
   
    Electricity(String customerName, int unitsConsumed)
	{
	 this.customerName = customerName;
	 this.unitsConsumed = unitsConsumed;
	}
	
	private boolean validateUnits()
	{
	 if(unitsConsumed > 0){
	  return true;
	 } else {
	  return false;
	 }
	}
	
	private int calculateBill()
	{
	int amount = 0;
	if(unitsConsumed <= 100)
	{
	 amount = unitsConsumed * 2;
	 return amount;
	} else if(unitsConsumed <= 200 ) {
	amount = (100 * 2) + (unitsConsumed - 100) * 3;
	 return amount;
	} else {
	amount = (100 * 2) + (100 * 3) + (unitsConsumed - 200) * 5;
	}
	  return amount;
	
	}
	
	public void generateBill()
	{
	if(validateUnits())
	{
	 System.out.println("Customer Name: " + customerName);
	  System.out.println("Total Electricity Bill: " + calculateBill());
	} else {
	 System.out.println("Invalid units consumed");
	}
   }
   }
   
   class ElectricityBill
   {
    public static void main(String[] args)
   {
    Electricity electricity = new Electricity("Rahul", 250);
	electricity.generateBill();
   }
   }