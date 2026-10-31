

   package com.kodewala.inter2;
    
	interface IFoodOrder
	{
	 void placeOrder(double amount);
	 
	 default void generateBill(double amount)
	 {
		 validateOrder(amount);
	  System.out.println("Generating Bill: " + amount);
	  
	 }
	 
	 static void calculateGST(double amount)
	 {
	 double gst = amount * 5 / 100;
	  System.out.println("Calculating GST amout:" + gst);
	 }
	 
	 private void validateOrder(double amount)
	 {
	  System.out.println("Validate Order amount: " + amount);
	 }
	 
	}
	
	class SwiggyOrder implements IFoodOrder
	{
	 public void placeOrder(double amount)
	{
	 System.out.println("Placed order food of amount: " + amount);
	}
	}
	
	class FoodOrder
	{
	public static void main(String[] args)
	{
	IFoodOrder.calculateGST(500);
	
	SwiggyOrder swiggy = new SwiggyOrder();
	
	swiggy.placeOrder(800);
	swiggy.generateBill(1000);
	}
	}