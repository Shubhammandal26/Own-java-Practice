package com.kodewala.open;

public interface ITicket
{
	void bookTicket();
}

class NormalTicket implements ITicket
{
	@Override
	public void bookTicket() {
		System.out.println("Normal Ticket Booking...");
	}
}

class PremiumTicket implements ITicket
{
	@Override
	public void bookTicket() {
		System.out.println("Premium Ticket Booking...");
	}
}

class BusinessTicket implements ITicket
{

	@Override
	public void bookTicket() {
		System.out.println("Business Ticket Booking...");
	}
 }

class TicketBookingService
{
	public void doBooking(ITicket ticket)
	{
		ticket.bookTicket();
	}
}
