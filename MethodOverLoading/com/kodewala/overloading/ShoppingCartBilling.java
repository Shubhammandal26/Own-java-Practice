
  package com.kodewala.overloading;
  
  class ShoppingCart
  {
  public void calculateBill(double price)
  {
  System.out.println("Price: " + price);
  }
  
   public void calculateBill(double price, int quantity)
  {
   double totalBill = price * quantity;
   System.out.println("Total Bill: " + totalBill);
   System.out.println("Quantity: " + quantity);
  }
  
   public void calculateBill(double price, int quantity, double discount)
  {
   double finalBill = price * quantity - discount;
   System.out.println("Final Bill: " + finalBill);
  }
  }
  
  class ShoppingCartBilling
  {
   public static void main(String[] args)
  {
   ShoppingCart shoppingCart = new ShoppingCart();
   shoppingCart.calculateBill(500);
   shoppingCart.calculateBill(500, 3);
   shoppingCart.calculateBill(500, 3, 200);
  }
  }