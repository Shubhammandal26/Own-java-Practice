package com.kodewala.collections;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) 
	{
		ArrayList<String> product = new ArrayList<String>();
		
		product.add("Laptop");
		product.add("Mouse");
		product.add("SmartPhone");
		product.add("Headphones");
		product.add("Keyboard");
		product.remove("Mouse");
		
		System.out.println("Product List: " + product);
		
		System.out.println("Total Product: " + product.size());
		System.out.println("Access Product by Index: "+ product.get(3));
		
		product.set(2, "Mouse");
		System.out.println("After Adding : " + product);

	}

}
