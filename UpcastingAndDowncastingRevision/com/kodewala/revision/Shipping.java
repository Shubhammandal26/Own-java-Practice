
    package com.kodewala.revision;
	
	class Shipping 
	{
	 public void calculateShippingCost()
	{
	System.out.println("Calculating shipping cost");
	}
	}
	
	class StandardShipping extends Shipping 
	{
	@Override
	 public void calculateShippingCost()
	{
	System.out.println("Calculating standard shipping cost...");
	}
	}
	
	class ExpressShipping extends Shipping 
	{
	@Override
	 public void calculateShippingCost()
	{
	System.out.println("Calculating express shipping cost...");
	}
	}
	
	class InternationalShipping extends Shipping 
	{
	@Override
	 public void calculateShippingCost()
	{
	System.out.println("Calculating international shipping cost...");
	}
	}