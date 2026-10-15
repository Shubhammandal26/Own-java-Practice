
    package com.kodewala.inheritance;
	
	class Product
	{
	 String productName;
	 String description;
	 int quantity;
	 String status;
	 
	 public Product(String productName,String description,int quantity,String status)
	 {
	  this.productName = productName;
	  this.description = description;
	  this.quantity = quantity;
	  this.status = status;
	 }
	 
	 public void viewProductDetails()
	 {
	 System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
	 }
	}
	
	
	class ElectronicProduct extends Product
	{
	boolean isWarrenty;
	int warrentyInYears;
	
	public ElectronicProduct(String productName, String description, int quantity, String status, boolean isWarrenty,int warrentyInYears) 
	{
		super(productName, description, quantity, status);
		this.isWarrenty = isWarrenty;
		this.warrentyInYears = warrentyInYears;
	}
	
	public void viewElectronicProductDetails() 
	{
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
		
		System.out.println(isWarrenty);
		System.out.println(warrentyInYears);
	}
	}
	
	class ClothingProduct extends Product 
	{
	String type;
	boolean isExchange;
	
	public ClothingProduct(String productName, String description, int quantity, String status, String type, boolean isExchange) 
	{
		super(productName, description, quantity, status);
		this.type = type;
		this.isExchange = isExchange;
	}
	
	public void viewClothingProduct() 
	{
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
		
		System.out.println(type);
		System.out.println(isExchange);
	}
	}
	
	
	class AllProduct
	{
	 public static void main(String[] args)
	{
	 Product product = new Product("Iphone", "This is an Iphone", 10, "Out-stock");
	 product.viewProductDetails();
	 
	 ElectronicProduct electronicProduct = new ElectronicProduct("Iphone", "This is an Iphone", 10, "Out-stock", true, 5);
	 electronicProduct.viewElectronicProductDetails();
	 
	 ClothingProduct clothingProduct = new ClothingProduct("Iphone", "This is an Iphone", 10, "Out-stock", "cotton",true);
	 clothingProduct.viewClothingProduct(); 
	 
	
	}
	}