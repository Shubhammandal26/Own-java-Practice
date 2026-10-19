
   package com.kodewala.abstraction;
   
   class ShoppingOrder
   {
    public boolean placeOrder(String productName, int quantity, int availableStock, String address)
	{
	 if(validateProduct(productName) && checkStock(quantity, availableStock) && validateAddress(address))
	 {
	 System.out.println("Order Placed successfully");
	  return true;
	 } 
	 else 
	 {
	  System.out.println("Order Placement failed!");
	 return false;
	 }
	}
	
	private boolean validateProduct(String productName)
	{
	if(productName != null && !productName.isEmpty())
	{
	System.out.println("Validating Product...");
	 return true;
	} else {
	System.out.println("Validating fail....");
	 return false;
	}
	}
	
	private boolean checkStock(int quantity, int availableStock)
	{
	if(quantity > 0 && quantity <= availableStock)
	{
		System.out.println("Checking stock...");
		return true;
	} else {
	System.out.println("Stock Not available");
	return false;
	}
	}
	
	private boolean validateAddress(String address)
	{
	 if(address != null && !address.trim().isEmpty())
	 {
	 System.out.println("Validating delivery address...");
	 return true;
	 } else {
	 System.out.println("Address is incorrect");
	  return false;
	 }
	}
   }
   
   class ShoppingManagement
   {
    public static void main(String[] args)
	{
	ShoppingOrder shoppingOrder = new ShoppingOrder();
	shoppingOrder.placeOrder("Shoes",10,12,"BTM Layout");
	}
   }
   