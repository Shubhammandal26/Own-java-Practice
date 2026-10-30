

   package com.kodewala.inter1;
   
   interface IBookings
   {
    void bookTicket();  // abstract method
	
	public default void printTicket()  // default
	{
	logBooking("Ticket Printing...");
	System.out.println("Printing ticket...");
	}
	
	static void checkBookingStatus()  // static
	{
	System.out.println("Checking Booking status...");
	}
	
	private static void logBooking(String message)  // private
	{
	 System.out.println("[LOG]: " + message);
	}
   }
   
   class FlightBooking implements IBookings
   {
   @Override
    public void bookTicket()
   {
   System.out.println("Booking Flight ticket....");
   }
   }
   
   class TrainBooking implements IBookings
   {
   @Override
    public void bookTicket()
   {
   System.out.println("Booking train ticket....");
   }
   @Override
   public void printTicket()
   {
	   System.out.println("Train booking ticket print");
   }
   }
   
   class OnlineBooking
   {
   public static void main(String[] args)
   {
    IBookings.checkBookingStatus();
	
	IBookings flight = new FlightBooking();
	flight.printTicket();
	flight.bookTicket();
	
	IBookings train = new TrainBooking();
	train.bookTicket();
	train.printTicket();
   }
   }