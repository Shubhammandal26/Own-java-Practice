package com.kodewala.encapsulation;

public class Product
{
	private int productId;
	private String productName;
	private int price;
	private int stockQuantity;
	
	public Product(int productId, String productName, int price, int stockQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}
	
	public void addStock(int quantity)
	{
		if(stockQuantity >= 0)
		{
			stockQuantity = stockQuantity + quantity;
			System.out.println("Product added successfully: " + stockQuantity);
		} else {
			System.out.println("Insufficient stock!");
		}
	}
	
	public void sellProduct(int quantity)
	{
		if(quantity > 0 && quantity <= stockQuantity)
		{
			stockQuantity = stockQuantity - quantity;
			System.out.println("Product sold successfully!");
		} else {
			System.out.println("Invalid quantity or insufficient stock!");
		}
	}
	
	public void checkStock()
	{
		System.out.println("Available stock: " + stockQuantity);
	}
	
	public int calculateInventoryValue()
	{
		int total = price * stockQuantity;
		return total;
	}
	 
  public void displayProductDetails()
  {
	  System.out.println("Product ID: " + productId);
	  System.out.println("Product Name: " + productName);
	  System.out.println("Product Price: " + price);
	  System.out.println("Product Stock Quantity: " + stockQuantity);
  }
}
