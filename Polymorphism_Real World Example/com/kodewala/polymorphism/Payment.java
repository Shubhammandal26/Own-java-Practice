
   package com.kodewala.polymorphism;
   
   public class Payment 
{
	public void doPayment()
	{
	 System.out.println("Payment.doPayment()...Payment");	
	}
}

class CreditCardPayment extends Payment 
{
	@Override
	public void doPayment()
	{
		System.out.println("CreditCardPayment.doPayment()...CreditCardPayment");
	}
}

class DebitCardPayment extends Payment
{
	@Override
	public void doPayment()
	{
		System.out.println("DebitCardPayment.doPayment()....DebitCardPayment");
	}
}

class NetBankingPayment extends Payment 
{
	@Override
	public void doPayment() {
		System.out.println("NetBankingPayment.doPayment()....NetBankingPayment");
	}
}

class UPIPayment extends Payment
{
	@Override
	public void doPayment()
	{
		System.out.println("UPIPayment.doPayment()....UPIPayment");
	}

}