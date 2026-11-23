package com.kodewala.collections;

import java.util.ArrayList;

public class ArrayListExample4 {

	public static void main(String[] args) 
	{
		ArrayList<String> city = new ArrayList<String>();
		
		city.add("Bengaluru");
		city.add("Mumbai");
		city.add("Chennai");
		city.add("Kolkata");
		
		System.out.println("City: "  + city.size());
		System.out.println("City at Index: " + city.get(2));

	}

}
