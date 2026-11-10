package com.kodewala.encapsulation;

public class ProductDriver {

	public static void main(String[] args) 
	{
		Product product = new Product(101, "Laptop", -50000, -10);
		
		product.addStock(5);
		product.sellProduct(3);
		product.sellProduct(20);
		
		product.checkStock();
		
		System.out.println(product.calculateInventoryValue());

	}

}
