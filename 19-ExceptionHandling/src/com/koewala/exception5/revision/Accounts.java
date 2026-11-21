package com.koewala.exception5.revision;

public class Accounts {

	public static void main(String[] args) 
	{
		Accounts a = new Accounts();
		a.doSomething();

	}
	
	public void doSomething()
	{
		System.out.println("Accounts.doSomething() START");
		
		String name = null;
		try  // risky code that may throw exception
		{
			System.out.println(name.length());
			System.out.println("After length()");
			
		} catch(NullPointerException e)
		{
			System.out.println("Name is null");
			e.printStackTrace();
		}
		System.out.println("Accounts.doSomething() END");
	}

}
