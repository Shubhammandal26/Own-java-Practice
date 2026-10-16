
   package com.kodewala.inheritance_type;
   
   class Product
{
	String productName;
	String description;
	int price;
	int quantity;
	
	public Product(String productName, String description, int price, int quantity) 
	{
		super();
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	 public void displayDetails()
	 {
		 System.out.println("Product Name: " + productName);
		 System.out.println("Product Description: " + description);
		 System.out.println("Product price: " + price);
		 System.out.println("Product Quantity: " + quantity);
	 }
}

class ElectronicProduct extends Product
{
   boolean isWarrenty;
   int manufacturingYear;
   
   public ElectronicProduct(String productName, String description, int price, int quantity, boolean isWarrenty,
		int manufacturingYear) 
   {
	super(productName, description, price, quantity);
	this.isWarrenty = isWarrenty;
	this.manufacturingYear = manufacturingYear;
   }
   
    public void displayElectronicProduct() 
    {
    	super.displayDetails();
    	System.out.println("Warrenty: " + isWarrenty);
    	System.out.println("Manufacturing year: " + manufacturingYear);
    }
   
}

class ClothingProduct extends Product
{
	String brand;
	boolean hasExchange;
	int size;
	
	public ClothingProduct(String productName, String description, int price, int quantity, String brand,
			boolean isExchange, int size) 
	{
		super(productName, description, price, quantity);
		this.brand = brand;
		this.hasExchange = isExchange;
		this.size = size;
	}
	public void showclothingDetails()
	{
		super.displayDetails();
		System.out.println("Brand Name: " + brand);
		System.out.println("Exchange: " + hasExchange);
		System.out.println("Size : " + size);
	}
	
}

public class ProductInfo {

	public static void main(String[] args) 
	{
		ClothingProduct cloth = new ClothingProduct("Shirt", "Cotton shirt", 800, 10, "Killer", true, 38);
		cloth.showclothingDetails();
		
		System.out.println("Electronic Product Details");
		
		System.out.println();
		
		ElectronicProduct electronic = new ElectronicProduct("Iphone", "512GB RAM", 150000, 8, false, 2026);
		electronic.displayElectronicProduct();
	}
}
    // multi level inheritance