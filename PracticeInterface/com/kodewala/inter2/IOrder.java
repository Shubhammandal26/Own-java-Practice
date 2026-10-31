

   package com.kodewala.inter2;
   
   interface IOrder
   {
    abstract double calculateOrderAmount(double price, int quantity);
	
	default void displayOrderDetails()
	{
	 System.out.println("Welcome to Online Shopping");
	}
	
	static double calculateDeliveryCharge(double amount)
	{
	 if(amount >= 5000)
	 {
	 System.out.println("FREE Delivery");
	 return 0;
	 } else {
	 System.out.println("Charge ₹100");
	 }
	return 100;
   }
   }
   
   class PremiumCustomer implements IOrder
   {
    public double calculateOrderAmount(double price, int quantity)
	{
	 double amount = price * quantity;
	 double discount = amount * 15 / 100;
	 double orderAmount = amount - discount;
	 return orderAmount;
	}
   }
   
   class RegularCustomer implements IOrder
   {
    public double calculateOrderAmount(double price, int quantity)
	{
	 double amount = price * quantity;
	 double discount = amount * 5 / 100;
	 double orderAmount = amount - discount;
	 return orderAmount;
	}
   }
   
   
   
   class ShoppingOrder
   {
   public static void main(String[] args)
   {
	double charge = IOrder.calculateDeliveryCharge(4500);
	
	IOrder premium = new PremiumCustomer();
	double orderAmounts = premium.calculateOrderAmount(2000, 3);
	premium.displayOrderDetails();
	double finalAmount = orderAmounts + charge;
	System.out.println("Final Amount: " + finalAmount);
	
	IOrder regular = new RegularCustomer();
	double orderAmounts1 = regular.calculateOrderAmount(2000, 3);
	regular.displayOrderDetails();
	double finalAmount1 = orderAmounts1 + charge;
	System.out.println("Final Amount: " + finalAmount1);
	
   }
   }