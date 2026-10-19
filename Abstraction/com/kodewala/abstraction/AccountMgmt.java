
   package com.kodewala.abstraction;
   
   class Account 
{
//	responsible for opening an account
	public boolean openAccount(String name, String address, String pan) // abstract
	{
		connectWithDB();
		validateNameAndAddress(name, address);
		validatePan(pan);
		createUserID();
		notifyUser();
		return true;	
	}
	
//	core functionality
	private boolean validateNameAndAddress(String name,String address)
	{
		System.out.println("Amount.validateNameAndAddress().. validating name and address");
		return true;
	}
	
//	core functionality
	private boolean validatePan(String pan)
	{
		System.out.println("Amount.validatePan()... validating Pan");
		return true;
	}
	
//	core functionality
	public void connectWithDB() {
		System.out.println("Amount.connectWithDB().. DB connection");
	}
	
//	core functionality
	public String createUserID()
	{
		System.out.println("Amount.userID()... creating user id...");
		return "some user id";
	}
	
//	core functionality
	public void notifyUser()
	{
		System.out.println("Amount.notifyUser() ... sending notification to user");
	}
	}

  
  public class AccountMgmt {

	public static void main(String[] args) 
	{ 
		Account account = new Account();
		account.openAccount("kodewala", "BTM", "GMUP4561AxR");

	}

}