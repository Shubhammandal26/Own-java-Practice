package com.koewala.exception3;

public class InsufficientBalanceException extends RuntimeException
{
	public InsufficientBalanceException(String msg)
	{
		super(msg);
	}

}
