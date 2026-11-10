package com.revision.oops;

public class Order 
{
	public boolean orderPlaced(String itemName, int price, boolean isAvailable, String address)
	{
		if(orderCheck(itemName) && orderAvailable(isAvailable))
		{
			System.out.println("Order Placed successfully");
			System.out.println("Item Name: " + itemName);
			System.out.println("Item Price: " + price);
			System.out.println("Item Available: " + isAvailable);
			System.out.println("Address: " + address);
			return true;
		} else {
			System.out.println("Order placed fail");
			return false;
		}
	}
	
	private boolean orderCheck(String itemName)
	{
		return itemName != null && !itemName.isEmpty();
	}
	
	private boolean orderAvailable(boolean isAvailable)
	{
		return isAvailable;
	}
  }
