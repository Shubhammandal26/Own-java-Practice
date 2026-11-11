package com.revision.oops;

class Payments
{
	void processPayment()
	{
		System.out.println("Processing Payment...");
	}
}

class CreditCardsPayment extends Payments
{
	void swipeCard()
	{
		System.out.println("Credit card swiped successfully...");
	}
}

class UPIs extends Payments
{
	void scanQRCode()
	{
		System.out.println("UPI QR code scanned successfully...");
	}
}

class Wallets extends Payments
{
	void checkWalletBalance()
	{
		System.out.println("Wallet balance checked successfully...");
	}
}
public class PaymentProcessingSystem {

	public static void main(String[] args) 
	{
		Payments cc = new CreditCardsPayment();
		
		if(cc instanceof CreditCardsPayment)
		{
			CreditCardsPayment ccp = (CreditCardsPayment) cc;
			cc.processPayment();
			ccp.swipeCard();
		} else {
			System.out.println("Invalid Credit Card");
		}
		
		Payments upi = new UPIs();
		
		if(upi instanceof UPIs)
		{
			UPIs upis = (UPIs) upi;
			upis.processPayment();
			upis.scanQRCode();
		} else {
			System.out.println("Invalid UPI ID...");
		}
	
		Payments wallet = new Wallets();
		
		if(wallet instanceof Wallets)
		{
			Wallets wallets = (Wallets) wallet;
			wallets.processPayment();
			wallets.checkWalletBalance();
		} else {
			System.out.println("Insufficient balance");
		}
		
	}
}
