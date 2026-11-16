package com.koewala.exception;

public class Driver1 {

	public static void main(String[] args) 
	{
		System.out.println("Driver1.main()... START");
		String name = args[0];
		int marks = Integer.parseInt(args[1]);
		
		System.out.println(name);  
//		if we do not pass args as name then we will get ArrayOutOfBoundsException
		
		System.out.println(marks);
		// if i enter marks as Five then we will get NumberFormatException
		
		int amount = 100;
		int part = 0;
		int total = amount / part;  // cannot / by zero
		System.out.println(total);  // ArithemticException
		
		System.out.println("Driver1.main()... END");

	}

}
