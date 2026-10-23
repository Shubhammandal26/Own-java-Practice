
   package com.kodewala.polymorphism;
   
   class Notification
   {
   public void sendNotification()
   {
    System.out.println("General notification sending");
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
   
   class WhatsAppNotification extends Notification
   {
   @Override
   public void sendNotification()
   {
    System.out.println("Sending notification through WhatsApp...");
   }
   }
   
   class PushNotification extends Notification
   {
   @Override
   public void sendNotification()
   {
    System.out.println("Sending notification through Push Notification...");
   }
   }
   
   