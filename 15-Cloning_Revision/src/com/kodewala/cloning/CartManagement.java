package com.kodewala.cloning;

public class CartManagement {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Product product = new Product(101, "Laptop", 55000);
		ShoppingCart cart = new ShoppingCart(501, "Rahul", product);
		
		ShoppingCart clonedCart = (ShoppingCart) cart.clone();
		
		System.out.println("Original Shopping Cart: ");
		System.out.println("Cart ID: " + cart.cartId);
		System.out.println("Customer: " + cart.customerName);
		System.out.println("Product: " + product.productName);
		System.out.println("Price: " + product.price);
		
		clonedCart.customerName = "Amit";
		clonedCart.product.price = 65000;
		System.out.println("Cloned Shopping Cart: ");
		System.out.println("Cart ID: " + clonedCart.cartId);
		System.out.println("Customer : " + clonedCart.customerName);
		System.out.println("Product: " + clonedCart.product.productName);
		System.out.println("Price: " + clonedCart.product.price);
		
		System.out.println("Original Cart After cloning: ");
		System.out.println("Customer: " + cart.customerName);
		System.out.println("Product: " + product.productName);
		System.out.println("Price: " + product.price);

	}

}
