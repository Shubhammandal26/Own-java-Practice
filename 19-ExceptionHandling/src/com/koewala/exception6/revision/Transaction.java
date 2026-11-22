package com.koewala.exception6.revision;

public class Transaction 
{
	String transactionId;
	String accountNumber;
	String transactionType;
	int amount;
	
	public Transaction(String transactionId, String accountNumber, String transactionType, int amount) 
	{
		super();
		this.transactionId = transactionId;
		this.accountNumber = accountNumber;
		this.transactionType = transactionType;
		this.amount = amount;
	}
	

}
