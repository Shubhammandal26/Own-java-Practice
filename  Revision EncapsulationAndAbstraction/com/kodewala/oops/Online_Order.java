 package com.kodewala.oops;
 
 class Order
 {
  private String productName;
  private int price;
  private int quantity;
  
  Order(String productName, int price, int quantity)
  {
   this.productName = productName;
   this.price = price;
   this.quantity = quantity;
   }
   
   public void displayProductDetails()
   {
   System.out.println("Product Name: " + productName);
    System.out.println("Product Price: " + price);
	 System.out.println("Product Quantity: " + quantity);
    }
  
  public void placeOrder()
  {
   if(validateQuantity() && checkPrice())
   {
    System.out.println("Order Placed successfully");
	int totalPrice = price * quantity;
	System.out.println("Total price: " + totalPrice);
   } else {
    System.out.println("Invalid product price or quantity");
   }
  }
  
  public String getProductName()
  {
   return productName;
   }
   
   public int getTotalPrice()
   {
    return price * quantity;
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
  
  private boolean checkPrice()
  {
    if(price > 0)
	{
	 return true;
	} else {
	 return false;
	}
  }
 }
 
  class Online_Order
  {
   public static void main(String[] args)
  {
   Order order = new Order("IPhone", 78000, 10);
   order.placeOrder();
   order.displayProductDetails();
  
  System.out.println("Product Name: " + order.getProductName());
  System.out.println("Total price: " + order.getTotalPrice());
  }
  }