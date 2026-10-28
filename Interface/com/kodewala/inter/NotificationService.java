
   package com.kodewala.inter;
   
   class NotificationService
   {
    public void process(INotification notification, String message)
	{
    notification.sendNotification(message);
   }
   
   public static void main(String[] args)
   {
    NotificationService service = new NotificationService();
	service.process(new EmailNotification(), "Your order has been shipped!");
	service.process(new SMSNotification(), "Your order has been shipped!");
   }
   }