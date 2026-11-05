package com.kodewala.emp;

public class ShoppingDriver {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Product product = new Product("Laptop", 55000, 1);
		
		ShoppingCart shopping = new ShoppingCart("Shivam", "Electronic", product);
		
		ShoppingCart clonedShopping = (ShoppingCart) shopping.clone();
		
		clonedShopping.product.quantity = 3;
		
		System.out.println("Cloned Product Quantity: " + clonedShopping.product.quantity);
		System.out.println("Original Product Quantity: " + product.quantity);
		
		System.out.println(shopping.product == clonedShopping.product);
	}
}
