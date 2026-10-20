 
 package com.kodewala.overloading;
  
  class OnlinePaymentSystem
  {
  public void makePayment(double amount)
  {
  System.out.println("Payment Amount: " + amount);
  }
  
   public void makePayment(double amount, String upiId)
  {
   
   System.out.println("Amount: " + amount);
   System.out.println("UPI ID: " + upiId);
  }
  
   public void makePayment(double amount, String cardNumber, String cardHolderName)
  {
   
   System.out.println("Amount: " + amount);
   System.out.println("Card Number: " + cardNumber);
   System.out.println("Card Holder Name: " + cardHolderName);
  }
  }
  
  class Payment
  {
   public static void main(String[] args)
  {
   OnlinePaymentSystem payment = new OnlinePaymentSystem();
   payment.makePayment(500);
   payment.makePayment(1000, "shubham1234");
   payment.makePayment(1500, "4526103214", "shubham");
  }
  }