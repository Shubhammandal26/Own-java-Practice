package com.kodewala.collections1;

import java.util.ArrayList;

public class Product {

	public static void main(String[] args) 
	{
		ArrayList<String> product = new ArrayList<String>();
		
		product.add("Laptop");
		product.add("Mobile");
		product.add("Speaker");
		product.add("Headphone");
		product.add("Mouse");
		
		System.out.println("Product Name: " + product);
		
//		product.remove("Headphone");
		System.out.println(product.size());
		System.out.println(product.set(4, "Charger"));
		System.out.println(product);

	}

}
