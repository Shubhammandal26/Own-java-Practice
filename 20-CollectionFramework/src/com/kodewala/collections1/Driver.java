package com.kodewala.collections1;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) 
	{
		ArrayList<String> city = new ArrayList<String>();
		
		city.add("BLR");
		city.add("CH");
		city.add("HYD");
		city.add("Dehli");
		city.add("AHM");
		
		System.out.println(city);
		
		city.add(1, "CBE");
		System.out.println(city);
		
		city.remove(1);
		System.out.println(city);
		
		System.out.println(city.get(3));
		
		System.out.println(city.size());

	}

}
