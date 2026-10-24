
   package com.kodewala.revision;
   
   class NotificationServices
   {
   public static void main(String[] args)
   {
   
     NotificationService service = new NotificationService();
	 
	 EmailNotifications email = new EmailNotifications();
	 service.send(email);
	 
	 SMSNotifications sms = new SMSNotifications();
	 service.send(sms);
	 
	 WhatsAppNotifications whatsApp = new WhatsAppNotifications();
	 service.send(whatsApp);
	
   }
   }