package com.koewala.exception5.revision;

public class InvalidAmountException extends RuntimeException
{
	
	private static final long serialVersionUID = 1L;

	public InvalidAmountException(String msg)
	{
		super(msg);
	}

}
