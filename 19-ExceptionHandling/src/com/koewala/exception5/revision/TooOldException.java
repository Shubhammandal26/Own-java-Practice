package com.koewala.exception5.revision;

public class TooOldException extends RuntimeException
{
	
	private static final long serialVersionUID = 1L;

	public TooOldException(String msg)
	{
		super(msg);
	}

}
