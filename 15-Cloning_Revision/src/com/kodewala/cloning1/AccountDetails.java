package com.kodewala.cloning1;

public class AccountDetails implements Cloneable
{
	String accountNumber;
	double balance;
	
	public AccountDetails(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
  }
