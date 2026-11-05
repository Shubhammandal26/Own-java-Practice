package com.kodewala.clean;

public class AccountDetails implements Cloneable
{
	String accountType;
	String accountNumber;
	String branch;
	
	public AccountDetails(String accountType, String accountNumber, String branch) {
		super();
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.branch = branch;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	
}
