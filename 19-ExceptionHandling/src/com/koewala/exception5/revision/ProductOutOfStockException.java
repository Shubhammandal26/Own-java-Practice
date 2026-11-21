package com.koewala.exception5.revision;

public class ProductOutOfStockException extends RuntimeException
{
	
	private static final long serialVersionUID = 1L;

	public ProductOutOfStockException(String msg)
	{
		super(msg);
	}

}
