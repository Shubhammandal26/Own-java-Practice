package com.koewala.exception;

public class CheckingException {

	public static void main(String[] args) 
	{
		System.out.println("CheckingException.main()... STARTED");
		
		CheckingException checking = new CheckingException();
		checking.doCheck(args);
		
		System.out.println("CheckingException.main()... ENDED");
	}
	
	void doCheck(String[] args)
	{
		try {
			System.out.println("CheckingException.doCheck()... STARTED");
			String name = args[0];
			int marks = Integer.parseInt(args[1]);
			
			System.out.println(name);
			System.out.println(marks);
			
		} catch(NumberFormatException e) 
		{
			System.out.println("Marks must be Number...");
			e.printStackTrace();
		}
		System.out.println("CheckingException.doCheck()... ENDED");
	}
}
