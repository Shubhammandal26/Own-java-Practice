package com.revision.oops;

public class BankingService implements IOnlineBanking, IMobileBanking
{

	@Override
	public void transferMoney(double amount) {
		System.out.println("Transfer amount: " + amount);
	}
	
	public void showTransactionDetails()
	{
		IOnlineBanking.super.showTransactionDetails();
		IMobileBanking.super.showTransactionDetails();
	}
}
