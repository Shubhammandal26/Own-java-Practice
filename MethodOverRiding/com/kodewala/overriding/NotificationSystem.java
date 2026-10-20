
   package com.kodewala.overriding;
	
  class Notification
	{
	 public void sendNotification()
	 {
	 System.out.println("Sending general notification...");
	 }
	}
	
	class EmailNotification extends Notification
	{
	@Override
	public void sendNotification()
	{
	System.out.println("Sending notification through Email...");
	}
	}
	
	class SMSNotification extends Notification
	{
	@Override
	 public void sendNotification()
	 {
	 System.out.println("Sending notification through SMS...");
	 }
	}
	
	class NotificationSystem
	{
	public static void main(String[] args)
	{
	  Notification notification = new Notification();
	  notification.sendNotification();
	  
	  EmailNotification email = new EmailNotification();
	  email.sendNotification();
	  
	  SMSNotification sms = new SMSNotification();
	   sms.sendNotification();
	}
	} 