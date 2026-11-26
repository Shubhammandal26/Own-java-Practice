package com.kodewala.collections3;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) 
	{
		int amount = 100;
		
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("Bhubaneswar");
		cities.add("Jamshedpur");
		cities.add("Bengaluru");
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Chennai");
		cities.add("Kolkata");
		cities.add("Bhubaneswar");
		cities.add("Bhubaneswar");
		cities.add(null);
		
		cities.remove("Bhubaneswar");
		
		System.out.println(cities);
		System.out.println(amount);

	}

}
