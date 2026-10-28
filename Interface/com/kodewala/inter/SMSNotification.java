
   package com.kodewala.inter;
   
   class SMSNotification implements INotification
   {
   @Override
    public void sendNotification(String message)
	{
	 System.out.println("Sending SMS: " + message);
	}
   }