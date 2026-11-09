package com.kodewala.inheritance;

class Product
{
	private String productId;
	private String productName;
	private double price;
	
	public Product(String productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.setPrice(price);
	}
	
	public void calculateDiscount()
	{
		System.out.println("Calculate Discount");
	}
	
	public void displayDetails()
	{
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + getPrice());
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}

class Electronic extends Product
{
	int warrantyPeriod;
	public Electronic(String productId, String productName, double price,int warrantyPeriod) 
	{
		super(productId, productName, price);
		this.warrantyPeriod = warrantyPeriod;
	}
	@Override
	public void calculateDiscount()
	{
		double discount = getPrice() * 10/100;
		double finalPrice = getPrice() - discount;
		System.out.println("Discount On Electronic Product: " + finalPrice);
	}
	
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Warranty Period: " + warrantyPeriod);
	}
}

class Clothing extends Product
{
	 int size;
	 public Clothing(String productId, String productName, double price,int size)
	 {
		super(productId, productName, price);
		this.size = size;
	 }
	 @Override
	 public void calculateDiscount()
		{
			double discount = getPrice() * 20/100;
			double finalPrice = getPrice() - discount;
			System.out.println("Discount On Clothing Product: " + finalPrice);
		}
		
	 @Override
	 public void displayDetails()
		{
			super.displayDetails();
			System.out.println("Size: " + size);
		}
}

class Grocery extends Product
{
	String expiryDate;
	public Grocery(String productId, String productName, double price,String expiryDate) 
	{
		super(productId, productName, price);
		this.expiryDate = expiryDate;
	}
	@Override
	public void calculateDiscount()
	{
		double discount = getPrice() * 5/100;
		double finalPrice = getPrice() - discount;
		System.out.println("Discount On Grocery Product: " + finalPrice);
	}
	
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("ExpiryDate: " + expiryDate);
	}
}
public class OnlineShopping {

	public static void main(String[] args) 
	{
		Product electronic = new Electronic("LAP", "Laptop", 60000, 24);
		electronic.calculateDiscount();
		electronic.displayDetails();
		
		Product	Cloth = new Clothing("T-Srt", "T-shirt", 800, 28);
		Cloth.calculateDiscount();
		Cloth.displayDetails();
		
		Product grocerry = new Grocery("COOK", "OREO", 40, "2026-01-12");
		grocerry.calculateDiscount();
		grocerry.displayDetails();
		

	}

}
