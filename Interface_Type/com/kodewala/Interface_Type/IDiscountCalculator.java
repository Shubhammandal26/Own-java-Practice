
  package com.kodewala.types;
  
  interface IDiscountCalculator
  {
  double calculateDiscount(double price, double discountPercentage);
  }
  
  class DiscountCalculator
  {
   public static void main(String[] args)
   {
   IDiscountCalculator calculate = (prices, percentage) ->
   {
   double discount = prices * percentage / 100; 
   System.out.println("Product Price: " + prices);
   System.out.println("Discount Percentage: " + percentage);
   System.out.println("Discount Amount: " + discount);
   double finalPrice = prices - discount;
   System.out.println("Final Price: " + finalPrice);
   return finalPrice;
   };
   
    double result = calculate.calculateDiscount(5000, 20);
	System.out.println(result);
  }
  }