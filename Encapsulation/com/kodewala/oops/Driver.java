
   package com.kodewala.oops;
   
   class Payment
   {
    private int balance;
	
	Payment(int balance){
	this.balance = balance;
	}
	
	//setter
     public void doCredit(int _amount)
	 {
	 if(_amount > 0){
	   balance = balance + _amount;
	 }
	 }
	 
	 public void doDebit(int _amount)
	 {
	  balance = balance - _amount;
	 }
	 
	 // getter
	 public int getBalance()
	 {
	   return balance;
	 }
   }
   
   
   class Driver
   {
    public static void main(String[] args)
   {
    Payment payment = new Payment(1800);
	payment.doCredit(200);
	System.out.println("Credit : " +payment.getBalance());
	
	payment.doDebit(500);
	System.out.println("Debit : " +payment.getBalance());
   
   }
   }