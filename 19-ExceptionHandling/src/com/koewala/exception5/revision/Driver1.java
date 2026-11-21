package com.koewala.exception5.revision;

public class Driver1 {

	public static void main(String[] args)
	{
		Driver1 d = new Driver1();
		d.soSomething();

	}
	
	public void soSomething()
	{
		System.out.println("Driver1.soSomething() STARTED");
		
		int amount = 100;
		
		try 
		{
		amount = amount/ 0;
			
		} catch (ArithmeticException e) 
		{
			System.out.println("Amount cannot be / zero");
			e.printStackTrace();
		}
		
		System.out.println("Driver1.soSomething() ENDED");
	}

}
