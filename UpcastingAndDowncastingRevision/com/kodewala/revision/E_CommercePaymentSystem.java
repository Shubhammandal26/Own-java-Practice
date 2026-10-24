
 package com.kodewala.revision;
 
 class E_CommercePaymentSystem 
 {
  public static void main(String[] args)
  {
   Payments payment1 = new CreditCardPayments();
   payment1.processPayment();
   
   Payments payment2 = new UPIPayments();
   payment2.processPayment();
   
   Payments payment3 = new NetBankingPayments();
   payment3.processPayment();
     
  
  }
  }