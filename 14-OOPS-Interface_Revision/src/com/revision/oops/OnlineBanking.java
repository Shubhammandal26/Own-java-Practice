package com.revision.oops;

public class OnlineBanking {

	public static void main(String[] args) 
	{
		IOnlineBanking bank = new BankingService();
		bank.transferMoney(15000);
		bank.showTransactionDetails();
		
		IMobileBanking mobile = new BankingService();
		mobile.transferMoney(20000);
		mobile.showTransactionDetails();

	}

}
