package com.kodewala.collections1;

import java.util.ArrayList;

public class CityMgmt {

	public static void main(String[] args) 
	{
		ArrayList<String> city = new ArrayList<String>();
		
		city.add("BLR");
		city.add("Chennai");
		city.add("HYD");
		city.add("Delhi");
		city.add("Ahmedabad");
		
//		System.out.println(city);
		
//		System.out.println("Is BLR available?: " + city.contains("BLR"));
//		System.out.println("Index of HYD: " + city.indexOf("HYD"));
//		city.remove("Ahmedabad");
//		
//		System.out.println("Updated City List: " + city);
//		System.out.println("Total Cities: " + city.size());
		
//		Normal for loop
		for(int i = 0; i < city.size(); i++)   
		{
			System.out.println(city.get(i));
		}
		
//		 Enhanced for loop
		for(String c: city)
		{
			System.out.println(c);
		}

	}
      }
