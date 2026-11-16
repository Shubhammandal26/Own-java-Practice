package com.koewala.exception;

public class DriverTry {

	public static void main(String[] args) 
	{
		System.out.println("DriverTry.main()... STARTED");
		
		DriverTry driverTry = new DriverTry();
		driverTry.doSomething();
		
		System.out.println("DriverTry.main()... STARTED");
	}
	
	void doSomething()
	{
		System.out.println("DriverTry.doSomething()... STARTED");
		
		try
		{
			int amount = 100;
			int part = 0;
			int total = amount / part;
			System.out.println(total);
		} 
		catch(Exception e) 
		{
			System.out.println("Total is 10..");
		 e.printStackTrace();	
		}
		System.out.println("DriverTry.doSomething()... ENDED");
	}

}
