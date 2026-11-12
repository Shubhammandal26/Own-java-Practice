package com.revision.oops;

public interface IBankAccount 
{
	public static final double MIN_BALANCE = 1000.00;
	void deposit(double amount);
	void withdraw(double amount);
	double checkBalance();

}
