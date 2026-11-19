package com.koewala.exception3;

public class DailyLimitExceededException extends RuntimeException
{
	public DailyLimitExceededException(String msg)
	{
		super(msg);
	}

}
