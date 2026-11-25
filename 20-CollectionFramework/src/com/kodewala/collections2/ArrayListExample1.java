package com.kodewala.collections2;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>(20);  
		
		list.add("Bengaluru");
		list.add("Kolkata");
		list.add("Chennai");
		list.add("Hyderabad");
		list.add("Delhi");
		
		list.add("Bengaluru");
		list.add("kolkata");
		list.add("Chennai");
		list.add("Hyderabad");
		list.add("Delhi");
		
		list.add("Jaipur");
		
		System.out.println(list.get(3));

	}

}
