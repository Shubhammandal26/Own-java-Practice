
  package com.kodewala.inter;
  
  public interface IPayments
  {
   boolean validatePayment(double amount);
   void processPayment(double amount);
  }