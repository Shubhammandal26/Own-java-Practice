package com.kodewala.emp;

public class ShoppingCart implements Cloneable
{
	String customerName;
	String cartId;
	Product product;
	
	public ShoppingCart(String customerName, String cartId, Product product) {
		super();
		this.customerName = customerName;
		this.cartId = cartId;
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
