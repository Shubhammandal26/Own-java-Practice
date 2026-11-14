package com.kodewala.open;

public class Notification {

	public static void main(String[] args) 
	{
		NotificationService service = new NotificationService();
		service.sendMessage(new EmailNotification());
		service.sendMessage(new EmailNotification());
		service.sendMessage(new WhatsAppNotification());
		service.sendMessage(new PushNotification());

	}

}
