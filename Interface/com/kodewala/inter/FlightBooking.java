
   package com.kodewala.inter;
   
   class FlightBooking implements IDiscount
   {
	   @Override
    public int calculateDiscount(int amount, int rate)
	{
	 int finalRate = amount - (amount * rate)/ 100;
	 return finalRate;
	}
	
	@Override
	public void calculateAmountTxn(int tax)
	{
		System.out.println("FlightBooking.calculateAmountTxn()");
	}
   
   }