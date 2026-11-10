package com.revision.oops;

class CabBooking
{
	public boolean bookCab(String passengerName, String pickupLocation, String dropLocation, boolean driverAvailable)
	{
		if(validatePassenger(passengerName) && validateLocation(pickupLocation, dropLocation) && checkDriverAvailability(driverAvailable))
		{
			System.out.println("Cab booked successfully");
			return true;
		}
	  else {
		System.out.println("Cab not booked");
		return false;
	}
	}
	
	
	private boolean validatePassenger(String passengerName)
	{
		if(passengerName != null && !passengerName.isEmpty())
		{
			System.out.println("Validating passenger...");
		return true;
		} else {
			System.out.println("Invalid PassengerName");
			return false;
		}
	}
	
	private boolean validateLocation(String pickupLocation, String dropLocation)
	{
		if(pickupLocation != null  && !pickupLocation.isEmpty()  && dropLocation != null && !dropLocation.isEmpty())
		{
			System.out.println("Validating pickup and drop locations...");
			return true;
		} else {
			System.out.println("Invalid pickup and drop location");
			return false;
		}
	}
	
	private boolean checkDriverAvailability(boolean driverAvailable)
	{
		if(driverAvailable)
		{
		System.out.println("Checking driver availability...");
		return true;
	}  else {
		System.out.println("Driver is not available");
		return false;
	}
	}
}

public class CabBookingMgmt {

	public static void main(String[] args) 
	{
		CabBooking cab = new CabBooking();
	boolean status = cab.bookCab("Ram", "HSR", "BTM", true);
     System.out.println("Booking status: " + status);
	}

}
