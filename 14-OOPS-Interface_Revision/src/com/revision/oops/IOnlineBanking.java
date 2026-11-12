package com.revision.oops;

public interface IOnlineBanking
{
	void transferMoney(double amount);
	public default void showTransactionDetails()
	{
		System.out.println("Online Banking Transaction Details...");
	}

}
