package com.kodewala.inheritance;

class DeliveryPartner
{
	int partnerId;
	String partnerName;
	
	DeliveryPartner(int partnerId, String partnerName)
	{
		this.partnerId = partnerId;
		this.partnerName = partnerName;
	}
	
	public void calculateDeliveryCharge()
	{
		System.out.println("Calculating Delivery Charge");
	}
	
	public void displayDeliveryInfo()
	{
		System.out.println("Partner ID: " + partnerId);
		System.out.println("Partner Name: " + partnerName);
	}
}

 class BikeDelivery extends DeliveryPartner
 {
	BikeDelivery(int partnerId, String partnerName) 
	{
		super(partnerId, partnerName);	
	}
	
	@Override
	public void calculateDeliveryCharge()
	{
		System.out.println("Bike Delivery Rs.30");
	} 
 }
 
 class CycleDelivery extends DeliveryPartner
 {

	CycleDelivery(int partnerId, String partnerName)
	{
		super(partnerId, partnerName);	
	}
	@Override
	public void calculateDeliveryCharge()
	{
		System.out.println("Cycle Delivery Rs.15");
	}
 }
 
 class CarDelivery extends DeliveryPartner
 {

	CarDelivery(int partnerId, String partnerName)
	{
		super(partnerId, partnerName);
	}
	@Override
	public void calculateDeliveryCharge()
	{
		System.out.println("Car Delivery Rs. 60");
	}
	 
 }
 
public class FoodDeliveryApplication {

	public static void main(String[] args) 
	{
		DeliveryPartner bike = new BikeDelivery(101, "Santosh");
		bike.calculateDeliveryCharge();
		bike.displayDeliveryInfo();
		
		DeliveryPartner cycle = new CycleDelivery(102, "Amit");
		cycle.calculateDeliveryCharge();
		cycle.displayDeliveryInfo();
		
		DeliveryPartner car = new CarDelivery(103, "Shiv");
		car.calculateDeliveryCharge();
		car.displayDeliveryInfo();

	}

}
