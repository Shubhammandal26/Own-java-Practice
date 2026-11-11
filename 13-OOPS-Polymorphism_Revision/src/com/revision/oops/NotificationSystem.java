package com.revision.oops;

class Notification
{
	void sendNotification()
	{
		System.out.println("Send Notification");
	}
}

class EmailNotification extends Notification
{
	@Override
	void sendNotification()
	{
		System.out.println("Send Notification via Email");
	}
}

class SMSNotification extends Notification
{
	void showNotification()
	{
		System.out.println("Send Notification via SMS Notification");
	}
}
public class NotificationSystem {

	public static void main(String[] args) 
	{
		Notification notification = new EmailNotification();
		EmailNotification email = (EmailNotification) notification;
		email.sendNotification();
	}
  }
