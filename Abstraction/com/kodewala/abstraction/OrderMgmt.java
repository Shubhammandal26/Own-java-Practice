
   package com.kodewala.abstraction;
   
     class Order
{
    public boolean orderPlaced(String itemName, int price,
                               boolean isAvailable, String address)
    {
        if (orderCheck(itemName) && orderAvailable(isAvailable))
        {
            System.out.println("Order placed successfully!");
            System.out.println("Item: " + itemName);
            System.out.println("Price: " + price);
            System.out.println("Address: " + address);
            return true;
        }

        System.out.println("Order placement failed!");
        return false;
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

   public class OrderMgmt {

	public static void main(String[] args) 
	{
		Order order = new Order();
		order.orderPlaced("Iphone", 78000, true, "BTM Bangalore");
	}

}
