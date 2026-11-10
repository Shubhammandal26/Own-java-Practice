package com.revision.oops;

public class Account 
{
	public boolean openAccount(String name, String address, String pan)
	{
		validateNameAndAddress(name, address);
		validatePan(pan);
		connectWithDB();
		createUserID();
		notifyUser();
		return true;
	}
	
	private boolean validateNameAndAddress(String name, String address)
	{
		System.out.println("Account.validateNameAndAddress()");
		return true;
	}
	
	private boolean validatePan(String pan)
	{
		System.out.println("Account.validatePan()... pan");
		return true;
	}
	
	public void connectWithDB()
	{
		System.out.println("Account.connectWithDB()... Connecting DB");
	}
	
	public String createUserID()
	{
		System.out.println("Amount.userID()... creating user id");
		return "some user id";
	}
	
	public void notifyUser()
	{
		System.out.println("Account.notifyUser()... sending notification to user");
	}

}
