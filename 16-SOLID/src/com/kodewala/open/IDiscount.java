package com.kodewala.open;

public interface IDiscount 
{
	void calculateDiscount(String customerType, double amount);

}

class RegularDiscount implements IDiscount
{
	@Override
	public void calculateDiscount(String customerType, double amount) 
	{
		double discounts = amount * 0.05;
		System.out.println("Customer type: " + customerType + ", and Apply Discount Rs.: " + discounts);
	}
}

class PremiumDiscount implements IDiscount
{
	@Override
	public void calculateDiscount(String customerType, double amount) 
	{
		double discounts = amount * 0.10;
		System.out.println("Customer type: " + customerType + ", and Apply Discount Rs.: " + discounts);
		
	}
	
}

class VIPDiscount implements IDiscount
{
	@Override
	public void calculateDiscount(String customerType, double amount) 
	{
		double discounts = amount * 0.20;
		System.out.println("Customer type: " + customerType + ", and Apply Discount Rs.: " + discounts);
	}
}

class CorporateDiscount implements IDiscount
{
	@Override
	public void calculateDiscount(String customerType, double amount) 
	{
		double discounts = amount * 0.30;
		System.out.println("Customer type: " + customerType + ", and Apply Discount Rs.: " + discounts);
	}
}

class DiscountService
{
	public void applyDiscount(IDiscount discount, String customerType,double amount)
	{
		discount.calculateDiscount(customerType, amount);
	}
}
