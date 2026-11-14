package com.kodewala.open;

public class Discount {

	public static void main(String[] args) 
	{
		DiscountService service = new DiscountService();
		service.applyDiscount(new RegularDiscount(), "Regular", 10000);
		service.applyDiscount(new PremiumDiscount(), "Premium", 10000);
		service.applyDiscount(new VIPDiscount(), "VIP", 10000);
		service.applyDiscount(new CorporateDiscount(), "Corporate", 10000);


	}

}
