package com.kodewala.cloning;

public class ShoppingCart implements Cloneable
{
	int cartId;
	String customerName;
	Product product;
	
	public ShoppingCart(int cartId, String customerName, Product product) 
	{
		super();
		this.cartId = cartId;
		this.customerName = customerName;
		this.product = product;
	}
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		ShoppingCart shop = (ShoppingCart) super.clone();
		shop.product = (Product) product.clone();
		return shop;
	}
}
