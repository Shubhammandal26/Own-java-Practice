
     package com.kodewala.inter;
	 
	 class Driver
	 {
	 public static void main(String[] args)
	 {
	  IDiscount discount =  new FlightBooking();
	 int result =  discount.calculateDiscount(5000, 10);
	 System.out.println("Result: " + result);
	 discount.calculateAmountTxn(10);
	 
	 }
	 }