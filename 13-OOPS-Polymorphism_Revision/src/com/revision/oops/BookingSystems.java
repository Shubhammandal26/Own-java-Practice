package com.revision.oops;

class Booking
{
	void doBooking(String name)
	{
		System.out.println("Booking ticket using name: " + name);
	}
	
	void doBooking(String name, String email)
	{
		System.out.println("Booking ticket using name: " + name + " with Email: " + email);
	}
	
	void doBooking(String name, long phoneNumber)
	{
		System.out.println("Booking ticket using name: " + name + " and Phone Number: " + phoneNumber);
	}
}
public class BookingSystems {

	public static void main(String[] args)
	{
		Booking book;
		book = new Booking();
		book.doBooking("Shubham");
		book.doBooking("Shubham", "shubham@gmail.com");
		book.doBooking("Shubham", 89741205623L);
		

	}

}
