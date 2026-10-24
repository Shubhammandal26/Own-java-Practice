
  package com.kodewala.revision;
  
  class Notifications
  {
  public void sendNotifications()
  {
   System.out.println("Sending notifications...");
  }
  } 
  
  class EmailNotifications extends Notifications
  {
   @Override
    public void sendNotifications()
	{
	 System.out.println("Sending notifications through Email...");
	}
	}
	
	class SMSNotifications extends Notifications
	{
	@Override
	public void sendNotifications()
	{
	 System.out.println("Sending notifications through SMS...");
	}
	}
	
	class WhatsAppNotifications extends Notifications
	{
	@Override
	public void sendNotifications()
	{
	 System.out.println("Sending notifications through WhatsApp...");
	}
	}