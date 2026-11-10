package com.kodewala.encapsulation;

public class Payment 
{
	private int balance;
	
	Payment(int balance)
	{
		this.balance = balance;
	}
	
	public void doCredit(int _amount)
	{
		if(_amount > 0)
		{
		balance = balance + _amount;
	}
	}
	
	public void doDebit(int _amount)
	{
		balance = balance - _amount;
	}
	
	public int getBalance()
	{
		return balance;
	}
	

}
