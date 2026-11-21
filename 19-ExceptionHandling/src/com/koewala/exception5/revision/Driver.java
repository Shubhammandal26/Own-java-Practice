package com.koewala.exception5.revision;

public class Driver {

	public static void main(String[] args) 
	{
		System.out.println("Driver.main() START");
		
		String name = args[0];  // NullPointerException if name = null
		System.out.println(name.length());
		
		int marks = Integer.parseInt(args[1]); // NumberFormatException if marks = "fifty"
		System.out.println(marks);
		
		int amount = 100;
		int part = 4;
		int total = amount / 0;  // ArithmeticException / by zero
		System.out.println("Total: " + total);
		
		System.out.println("TO-DO");
		System.out.println("TO-DO");
		System.out.println("TO-DO");
		System.out.println("TO-DO");

		System.out.println("Driver.main() END");
	}

}
