

    package com.kodewala.inter2;
	
	interface UPI
{
    default void transaction()
    {
        System.out.println("UPI Transaction");
    }
}

interface Wallet
{
    default void transaction()
    {
        System.out.println("Wallet Transaction");
    }
}

  class PhonePe implements UPI, Wallet
  {
	  @Override
     public void transaction()
	 {
		 UPI.super.transaction();
		 Wallet.super.transaction();
		 System.out.println("Phone Pe transaction done");
	 }
	 
    }
	
	class DiamondProblem
	{
	public static void main(String[] args)
	{
	 PhonePe upi = new PhonePe();
	 upi.transaction();
	 
	 
	
	}
	}