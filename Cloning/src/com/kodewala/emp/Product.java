
package com.kodewala.emp;

public class Product implements Cloneable
{
	String productName;
	int price;
	int quantity;
	
	public Product(String productName, int price, int quantity) {
		super();
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	

}
