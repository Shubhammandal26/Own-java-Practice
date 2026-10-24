
  package com.kodewala.revision;
  
  class Notification
  {
  public void sendNotification()
  {
   System.out.println("sending notification...");
  }
  }
  
  class EmailNotification extends Notification
  {
  @Override
  public void sendNotification()
  {
   System.out.println("Sending email notification...");
  }
  public void showEmailAddress()
  {
   System.out.println("Email address: user@example.com");
  }
  }
  
  class SMSNotification extends Notification
  {
  @Override
  public void sendNotification()
  {
   System.out.println("Sending SMS notification");
  }
  public void showPhoneNumber()
  {
   System.out.println("Phone number: 9876543210");
  }
  }
  
  class NotificationSystem
  {
   public static void main(String[] args)
  {
   Notification notif = new EmailNotification();
   notif.sendNotification();
   
   Notification noti = new SMSNotification();
   noti.sendNotification();
   
   if(notif instanceof EmailNotification)
   {
    EmailNotification email = (EmailNotification) notif;
	email.showEmailAddress();
   }
   
   if(noti instanceof SMSNotification)
   {
    SMSNotification sms = (SMSNotification) noti;
	sms.showPhoneNumber();
   }
  }
  }