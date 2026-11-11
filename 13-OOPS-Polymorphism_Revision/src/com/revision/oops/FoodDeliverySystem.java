package com.revision.oops;

class DeliveryPartner
{
	void deliveryPartner()
	{
		System.out.println("Order is being delivered...");
	}
}

class ZomatoDelivery extends DeliveryPartner
{
	@Override
	void deliveryPartner()
	{
		System.out.println("Order is being delivered by Zomato...");
	}
}

class SwiggyDelivery extends DeliveryPartner
{
	@Override
	void deliveryPartner()
	{
		System.out.println("Order is being delivered by Swiggy...");
	}
}

class OwnDelivery extends DeliveryPartner
{
	@Override
	void deliveryPartner()
	{
		System.out.println("Order is being delivery by own...");
	}
}
public class FoodDeliverySystem {

	public static void main(String[] args)
	{
     DeliveryPartner zomato = new ZomatoDelivery();
     zomato.deliveryPartner();
     
     DeliveryPartner swiggy = new SwiggyDelivery();
     swiggy.deliveryPartner();
     
     DeliveryPartner own = new OwnDelivery();
     own.deliveryPartner();

	}

}
