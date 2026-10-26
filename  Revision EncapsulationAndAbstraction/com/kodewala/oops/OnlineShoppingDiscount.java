   package com.kodewala.oops;

  class ShoppingCart
  {
   private String customerName;
   private double totalAmount;
   private int discountPercentage;
   
   ShoppingCart(String customerName, double totalAmount, int discountPercentage)
   {
    this.customerName = customerName;
	this.totalAmount = totalAmount;
	this.discountPercentage = discountPercentage;
   }
   
    private boolean validateAmount()
   {
    if(totalAmount > 0)
	{
	return true;
	} else {
	 return false;
	}
   }
   
   private double calculateDiscount()
   {
   double discount = 0;
    if(totalAmount >= 5000)
   {
     discount = totalAmount * discountPercentage  / 100;
	return discount;
   } else if(totalAmount >= 2000) {
     discount = totalAmount * discountPercentage / 100;
	 return discount;
   } else {
   return 0;
   }
  }
  
  public void generateBill()
  {
   if(validateAmount())
   {
   System.out.println("Customer Name: " + customerName);
   System.out.println("Discount Amount: " + calculateDiscount());
   double discount = calculateDiscount();
   double  finalAmount = totalAmount - discount;
   System.out.println("Final Amount: " +  finalAmount);
   } else{
   System.out.println("Invalid shopping amount");
   }
  }
  }
  
  class OnlineShoppingDiscount
  {
   public static void main(String[] args)
  {
   ShoppingCart cart = new ShoppingCart("Rahul", 5000, 20);
   cart.generateBill();
  
  }
  }