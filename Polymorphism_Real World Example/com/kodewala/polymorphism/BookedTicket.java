
   package com.kodewala.polymorphism;
   
   public class BookedTicket {

	public static void main(String[] args) 
	{
	 BookingTicket bookingTicket = new BookingTicket();
	 
//	 for the  user#1, he/she selected ticket method as Business
	 BusinessClassTicket businessClassTicket = new BusinessClassTicket();
	 bookingTicket.ticketBooking(businessClassTicket);
	 
//	 for the  user#1, he/she selected ticket method as First class Ticket
	 
	 FirstClassTicket firstClass = new FirstClassTicket();
	 bookingTicket.ticketBooking(firstClass);
	 
//	 for the  user#1, he/she selected ticket method as Economy Class
	 
	 EconomyClassTicket ecomomy = new EconomyClassTicket();
	 bookingTicket.ticketBooking(ecomomy);
	 
	 PremiumEconomyClassTicket premium = new PremiumEconomyClassTicket();
	 bookingTicket.ticketBooking(premium);
	 

   
	}

}
