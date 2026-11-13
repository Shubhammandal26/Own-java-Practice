package com.kodewala.open;

public interface ITicketBooking 
{
	void ticketBooking();
}

class EconomyClass implements ITicketBooking
{
	@Override
	public void ticketBooking() 
	{
		System.out.println("Economy class Ticket Booking...");
		
	}
}

class PremiumEconomyClass implements ITicketBooking
{
	@Override
	public void ticketBooking() 
	{
		System.out.println("Premium Economy class Ticket Booking...");
		
	}
}

class FirstClass implements ITicketBooking
{
	@Override
	public void ticketBooking() 
	{
		System.out.println("First class Ticket Booking...");
		
	}
}

class Booking
{
	public void doBooking(ITicketBooking booking)
	{
		booking.ticketBooking();
	}
}
