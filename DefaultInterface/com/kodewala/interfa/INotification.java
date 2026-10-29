

   package com.kodewala.interfa;
   
   public interface INotification
   {
     void sendNotification(String message);
	 
	 public default void showDeliveryConfirmation()
	 {
	 System.out.println("Notification delivery process completed");
	 }
   }
   
   class EmailNotification implements INotification
   {
    @Override
	public void sendNotification(String message)
	{
	 System.out.println("Sending Email: " + message);
	}
   }
   
   class SMSNotification implements INotification
   {
    @Override
	public void sendNotification(String message)
	{
	 System.out.println("Sending SMS: " + message);
	}
   }
   
   class NotificationService
   {
    public void send(INotification notification, String message)
	{
	  notification.sendNotification(message);
	  notification.showDeliveryConfirmation();
	}
   }
   
   class NotificationSystem
   {
    public static void main(String[] args)
   {
    NotificationService service = new NotificationService();
	service.send(new EmailNotification(), "followed the message");
	service.send(new SMSNotification(), "followed by the message");
   
   }
   }
   
   