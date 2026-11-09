package com.kodewala.inheritance;

class Room
{
	int roomNumber;
	String customerName;
	int pricePerNight;
	
	public Room(int roomNumber, String customerName, int pricePerNight) 
	{
		super();
		this.roomNumber = roomNumber;
		this.customerName = customerName;
		this.pricePerNight = pricePerNight;
	}
	public void calculateBill(int nights)
	{
		System.out.println("Calculating Bills.");
	}
}

class DeluxeRoom extends Room
{
	boolean complimentaryBreakfast;
	public DeluxeRoom(int roomNumber, String customerName, int pricePerNight,boolean complimentaryBreakfast)
	{
		super(roomNumber, customerName, pricePerNight);
		this.complimentaryBreakfast = complimentaryBreakfast;
	}
	@Override
	public void calculateBill(int nights)
	{
		int bills = nights * pricePerNight;
		System.out.println("Customer: " + customerName);
	    System.out.println("Room Number: " + roomNumber);
	    System.out.println("Total Nights: " + nights);
		System.out.println("Total Bills: " + bills);
	}
}

class SuiteRoom extends Room
{
     boolean privatePool;
	public SuiteRoom(int roomNumber, String customerName, int pricePerNight,boolean privatePool) 
	{
		super(roomNumber, customerName, pricePerNight);
		this.privatePool = privatePool;
	}
	@Override
	public void calculateBill(int nights)
	{
		int bills = nights * pricePerNight;
		System.out.println("Customer: " + customerName);
	    System.out.println("Room Number: " + roomNumber);
	    System.out.println("Total Nights: " + nights);
		System.out.println("Total Bills: " + bills);
	}
	
}
public class HotelBookingMgmt
{
	public static void main(String[] args)
	{
		Room room = new DeluxeRoom(110, "Rahul", 1200, true);
		room.calculateBill(5);
		
		Room suit = new SuiteRoom(112, "Shiv", 1500, true);
		suit.calculateBill(8);

	}

}
