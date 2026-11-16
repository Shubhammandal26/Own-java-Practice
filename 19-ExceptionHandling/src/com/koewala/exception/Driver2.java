package com.koewala.exception;

public class Driver2 {

	public static void main(String[] args)
	{
		System.out.println("Driver2.main()... START");
		
		Driver2 driver2 = new Driver2();
		driver2.doSomething();
		
		System.out.println("Driver2.main()... END");

	}
	
	void doSomething()
	{
       System.out.println("Driver2.doSomething()... START");
       
       String name = null;
       
       try {
    	   System.out.println(name.length());  // NPE
    	   System.out.println("After length()"); // Ignore
       } 
       catch(NullPointerException e)
       {
    	   System.out.println("Name is null...");
    	   e.printStackTrace();
       }
       

       System.out.println("Driver2.doSomething()... END");
	}

}
