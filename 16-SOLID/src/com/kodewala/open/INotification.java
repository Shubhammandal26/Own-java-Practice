package com.kodewala.open;

public interface INotification 
{
	void sendNotification();
}

class EmailNotification implements INotification
{
	@Override
	public void sendNotification() {
		System.out.println("Sending Email Notification...");
	}
}

class SMSNotification implements INotification
{
	@Override
	public void sendNotification() {
		System.out.println("Sending SMS Notification....");
	}
}

class WhatsAppNotification implements INotification
{
	@Override
	public void sendNotification() {
		System.out.println("Sending WhatsApp Notification...");
	}
}

class PushNotification implements INotification
{
	@Override
	public void sendNotification() {
		System.out.println("Sending Push Notification...");
	}
}

class NotificationService
{
	public void sendMessage(INotification notification)
	{
		notification.sendNotification();
	}
}


