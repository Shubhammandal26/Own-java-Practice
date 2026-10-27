
   package com.kodewala.solid;
   
   class Payment
   {
   public void processPayment()
   {
    System.out.println("Payment.processPayment().... Payment");
   }
   }
   
   class CreditCardPayment  extends  Payment
   {
   @Override
    public void processPayment() {
        System.out.println("Processing credit card payment");
    }
   }
   
   class UPIPayment extends Payment
   {
   @Override
    public void processPayment() {
        System.out.println("Processing upi payment");
    }
   }
   
   class Wallet  extends  Payment
   {
   @Override
    public void processPayment() {
        System.out.println("Processing wallet payment");
    }
   }