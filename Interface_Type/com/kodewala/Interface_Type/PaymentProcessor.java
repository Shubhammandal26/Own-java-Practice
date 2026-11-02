
 package com.kodewala.types;
 
 interface PaymentProcessor
 {
  boolean processPayment(double amount);
 }
 
 class PaymentService
 {
  public static void main(String[] args)
 {
  PaymentProcessor creditCardAmount = (amount) ->
  {
  System.out.println("Processing Credit card Payment of $: " + amount);
  return true;
  };
  boolean status = creditCardAmount.processPayment(250.75);
  System.out.println("Payment sucessful: " + status);
 }
 }