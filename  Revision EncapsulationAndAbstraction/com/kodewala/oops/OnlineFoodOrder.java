
   package com.kodewala.oops;
   
   class FoodOrder
   {
   private String foodName;
   private double price;
   private int quantity;
   private int availableStock;
   
   FoodOrder(String foodName, double price, int quantity, int availableStock)
   {
    this.foodName = foodName;
    this.price = price;
    this.quantity = quantity;
    this.availableStock = availableStock;	
   }
   
    private boolean validateQuantity()
	{
	 if(quantity > 0)
	 {
	   return true;
	 } else {
	  return false;
	 }
	}
	
	 private boolean checkStock()
	 {
	  if(quantity <= availableStock)
	  {
	   return true;
	  }  else {
	   return false;
	  }
	 }
      
	  private double calculateTotalBill()
	  {
	    double totalBill = price * quantity;
           return totalBill;		
	  }
	  
	  public void placeOrder()
	  {
	   if(validateQuantity() && checkStock())
	   {
	    System.out.println("Food Name: " + foodName);
		 System.out.println("Total Bill: " + calculateTotalBill());
	   } else {
	    System.out.println("Order failed: Invalid quantity or insufficient stock");
	   }
	  }
   }
   
   class OnlineFoodOrder
   {
    public static void main(String[] args)
   {
    FoodOrder foodOrder = new FoodOrder("Pizza", 250, 2, 5);
	foodOrder.placeOrder();
   
   }
   }