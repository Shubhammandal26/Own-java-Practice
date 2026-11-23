package com.kodewala.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args)
	{
		ArrayList<String> products = new ArrayList<String>();
		
		products.add("Laptop");
		products.add("Smartphone");
		products.add("Headphones");
		
		System.out.println("Electronic Products: " + products);
		
		System.out.println("First Product: " + products.get(0));
		products.remove("smarphone");
		
		System.out.println("After removing smartphone: " + products);
		
		System.out.println("Total Products: " + products.size());

	}

}
