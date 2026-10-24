
 package com.kodewala.revision;
 
 class Payments
 {
  public void processPayment()
  {
  System.out.println("Payments processing...");
  }
 }
 
 class CreditCardPayments extends Payments
 {
 @Override
 public void processPayment()
 {
  System.out.println("Processing through Credit card...");
 }
 }
 
 class UPIPayments extends Payments
 {
  @Override
 public void processPayment()
 {
  System.out.println("Processing through UPI...");
 }
 }
 
 class NetBankingPayments extends Payments
 {
 @Override
 public void processPayment()
 {
  System.out.println("Processing throug Net Banking...");
 }
 }