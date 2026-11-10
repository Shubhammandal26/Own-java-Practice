package com.revision.oops;

class ProductReturn
{
	public boolean requestReturn(String orderId, boolean delivered, int daysSinceDelivery, boolean itemUnused)
	{
		if(validateOrderId(orderId) && checkDeliveryStatus(delivered) && checkReturnWindow(daysSinceDelivery) && checkItemCondition(itemUnused))
		{
			System.out.println("Returned requested submitted successfully!");
			return true;
		} else {
			System.out.println("Returned request rejected...");
			return false;
		}
	}
	private boolean validateOrderId(String orderId)
	{
		if(orderId != null && !orderId.trim().isEmpty())
		{
			System.out.println("Validating order ID...");
			return true;
		} else {
			System.out.println("Invalid order ID...");
			return false;
		}
	}
	
	private boolean checkDeliveryStatus(boolean delivered)
	{
		if(delivered)
		{
			System.out.println("Checking delivery status...");
			return true;
		} else {
			System.out.println("Status not available...");
			return false;
		}
	}
	
	private boolean checkReturnWindow(int daysSinceDelivery)
	{
		if(daysSinceDelivery >= 0 && daysSinceDelivery <= 7)
		{
			System.out.println("Checking return window...");
			return true;
		} else {
			System.out.println("Return reject...");
			return false;
		}
	}
	
	private boolean checkItemCondition(boolean itemUnused)
	{
		if(itemUnused)
		{
			System.out.println("Checking product condition...");
			return true;
		} else {
			System.out.println("Product reject...");
			return false;
		}
	}
}
public class ReturnManagement {

	public static void main(String[] args) 
	{
		ProductReturn requestReturn = new ProductReturn();
	boolean status = requestReturn.requestReturn("ORD123", true, 3, true);
	System.out.println("Return status: " + status);

	}

}
