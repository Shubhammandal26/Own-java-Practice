
  package com.kodewala.prerequisite;
  
  class Driver
  {
  public static void main(String[] args)
  {
    System.out.println("Driver.main START");
	
   User u1 = new User("Kodewala", "KA123", "9988665521"); 
   User u2 = new User("Kodewala Academy", "KA1234", "0123456789");
  
   System.out.println("Driver.main END");
  }
  }
   class User
  {
   String userName;
   String userID;
   String mobileNumber;
   
   static {
   System.out.println("I am in static init block");
   }
   
   User(String userName,String userID,String mobileNumber)
   {
   this.userName = userName;
   this.userID = userID;
   this.mobileNumber = mobileNumber;
   }
  }
  