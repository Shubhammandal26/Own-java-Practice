package com.kodewala.open;

public class Ticket {

	public static void main(String[] args) 
	{
		TicketBookingService booking = new TicketBookingService();
		booking.doBooking(new NormalTicket());
		booking.doBooking(new PremiumTicket());
		booking.doBooking(new BusinessTicket());
	}

}
