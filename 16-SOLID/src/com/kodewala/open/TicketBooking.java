package com.kodewala.open;

public class TicketBooking {

	public static void main(String[] args) 
	{
		Booking book = new Booking();
		book.doBooking(new EconomyClass());
		book.doBooking(new PremiumEconomyClass());
		book.doBooking(new FirstClass());

	}
  }
