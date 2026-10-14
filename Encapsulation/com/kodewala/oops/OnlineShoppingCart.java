 
 package com.kodewala.oops;
 
 class  OnlineShoppingCart
 {
 public static void main(String[] args)
 {
   ShoppingCart cart = new ShoppingCart("Shubham", "Keyboard", 400, 2);
   cart.discount();
 }
 }
 
  class ShoppingCart
  {
   private String customerName;
   private String productName;
   private int price;
   private int quantity;
   
   ShoppingCart(String customerName,String productName,int price, int quantity)
   {
    this.customerName = customerName;
	this.productName = productName;
	this.price = price;
	this.quantity = quantity;
   }
   
  
    
	 public int discount()
	 {
	   int totalPrice = price * quantity;
       int discount = 0;

      if(totalPrice > 600){
		  discount = totalPrice * 2/100;
	  }	
      
	   int finalPrice = totalPrice - discount;

    System.out.println("Total Price: " + totalPrice);
    System.out.println("Discount: " + discount);
    System.out.println("Final Price: " + finalPrice);

    return finalPrice;
     	  
	 }
	 
   
  }