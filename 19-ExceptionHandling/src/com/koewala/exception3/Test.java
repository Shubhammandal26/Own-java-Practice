package com.koewala.exception3;

public class Test 
{
	static int someValue;

	public static void main(String[] args) 
	{
		System.out.println("This is sample program - START");
		
		String name = null;
		
		try {
			int amount = 200 / 0;
			
			System.out.println("Amount " + amount);
			System.out.println("Before Exception");
			
			System.out.println("length " + name.length());
			
			System.out.println("After Exception");
			
		} 
		catch(NullPointerException e)
		{
		  e.printStackTrace();
		  System.out.println("Name is null...");
		}
		catch(ArithmeticException e)
		{
            e.printStackTrace();
            System.out.println("Can not divide by zero");
		} catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Something went wrong!");
		}
		System.out.println("Placing order now!!!");
		System.out.println("This is sample program - END");
	}

}
