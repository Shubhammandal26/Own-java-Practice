package com.revision.oops;

public interface IBankNotification 
{ 
	public default void sendEmailNotification()
	{
		validetCustomer();
		System.out.println("Send Notification via Email...");
	}
	
	public default void sendSMSNotification()
	{
		validetCustomer();
		System.out.println("Send Notification via SMS...");
	}
	
	private static void validetCustomer()
	{
		System.out.println("Customer validation successful");
	}

}
