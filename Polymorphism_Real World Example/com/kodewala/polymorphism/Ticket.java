
    package com.kodewala.polymorphism;
	
	 class Ticket 
     {
	public void doBooking()
	{
		System.out.println("Ticket.doBooking().... Ticket");
	}
}

 class BusinessClassTicket extends Ticket
{
	@Override
	public void doBooking()
	{
		System.out.println("BusinessClassTicket.doBooking()... BusinessClassTicket");
	}
}

    class FirstClassTicket extends Ticket
{
	@Override
	public void doBooking()
	{
		System.out.println("FirstClassTicket.doBooking()...FirstClassTicket");
	}
}

class EconomyClassTicket extends Ticket
{
	@Override
	public void doBooking()
	{
		System.out.println("EconomyClassTicket.doBooking()... EconomyClassTicket");
	}
}

class PremiumEconomyClassTicket extends Ticket
{
	@Override
	public void doBooking()
	{
		System.out.println("PremiumEconomyClassTicket.doBooking()....PremiumEconomyClassTicket");
	}

}


