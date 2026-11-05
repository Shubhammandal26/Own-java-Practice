package com.tcs.emp;

public class ShoppingCart implements Cloneable
{
	String customerName;
	String cardId;
	Product product;
	
	public ShoppingCart(String customerName, String cardId, Product product) {
		super();
		this.customerName = customerName;
		this.cardId = cardId;
		this.product = product;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		ShoppingCart s = (ShoppingCart) super.clone();
		s.product = (Product) product.clone();
		return s;
	}

}
