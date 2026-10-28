
  package com.kodewala.inter;
  
  class EmailNotification implements INotification
  {
	  @Override
   public void sendNotification(String message)
   {
   System.out.println("Sending Email: " + message);
   }
  
  }