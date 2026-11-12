package com.revision.oops;

public interface IMobileBanking 
{
	void transferMoney(double amount);
	public default void showTransactionDetails()
	{
		System.out.println("Mobile Banking Transaction Details");
	}

}
