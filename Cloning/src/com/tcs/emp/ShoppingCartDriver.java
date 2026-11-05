package com.tcs.emp;

public class ShoppingCartDriver {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Product pro = new Product("Laptop", 50000, 2);
		
		ShoppingCart shopping = new ShoppingCart("Shubham", "LAP", pro);
		
		ShoppingCart clonedShopping = (ShoppingCart) shopping.clone();
		
		System.out.println("Original Cart: ");
		
		System.out.println("Customer: " + shopping.customerName);
//		System.out.println("Cart ID: " + shopping.cardId);
		System.out.println("Product: " + shopping.product.productName);
		System.out.println("Price: " + shopping.product.price);
		System.out.println("Quantity: " + shopping.product.quantity);
		
		clonedShopping.product.price = 1500;
		clonedShopping.product.quantity = 5;
		System.out.println("Cloned Cart: ");
		System.out.println("Customer: " + clonedShopping.customerName);
		System.out.println("Product: " + clonedShopping.product.productName);
		System.out.println("Price: " + clonedShopping.product.price);
		System.out.println("Quantity: " + clonedShopping.product.quantity);

	}

}
