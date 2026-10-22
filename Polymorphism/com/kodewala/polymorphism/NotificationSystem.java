
   package com.kodewala.polymorphism;
   
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
	System.out.println("Sending email notification...");
   }
   public void sendAttachment()
   {
    System.out.println("Sending email attachment...");
   }
   }
   
   class NotificationSystem
   {
    public static void main(String[] args)
   {
       Notification notification = new EmailNotification(); // upcasting
	   notification.sendNotification();
	   
	   if(notification instanceof EmailNotification)
	   {
		   EmailNotification emailNotification = (EmailNotification) notification; // downcasting
		   emailNotification.sendAttachment();
	   }
   
   }
   }