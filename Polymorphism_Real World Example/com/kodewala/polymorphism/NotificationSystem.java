
   package com.kodewala.polymorphism;
   
   class NotificationSystem
   {
    public static void main(String[] args)
   {
	   NotificationService notificationService = new NotificationService();
    EmailNotification email = new EmailNotification();
	notificationService.send(email);
	
	SMSNotification sms = new SMSNotification();
	notificationService.send(sms);
	
	WhatsAppNotification whatsApp = new WhatsAppNotification();
	notificationService.send(whatsApp);
	
	PushNotification push = new PushNotification();
	notificationService.send(push);
   
   }
   }
   