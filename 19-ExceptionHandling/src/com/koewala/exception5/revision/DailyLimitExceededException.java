package com.koewala.exception5.revision;

public class DailyLimitExceededException extends RuntimeException
{
	public DailyLimitExceededException(String msg)
	{
		super(msg);
	}

}
