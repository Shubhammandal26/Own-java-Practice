package com.kodewala.collections3;

import java.util.ArrayList;

public class Driver1 {

	public static void main(String[] args) 
	{
		int amount = 140;
		ArrayList<String> list = new ArrayList<String>();
		
//		Default capacity = 10
		
		list.add("Ram");       // index 0
		list.add("Amit");      // index 1
		list.add("Bishu");     // index 2
		list.add("Chandan");   // index 3
		list.add("Deelip");    // index 4
		list.add("Harish");    // index 5
		list.add("Jay");       // index 6
		list.add("Krishna");   // index 7
		list.add("Manoj");     // index 8
		list.add("Naresh");    // index 9
		list.add("Pappu");     // index 10
		
		list.add("Ritesh");    // index 11
		
		list.add(11, "Hari");
		list.remove(9);
		System.out.println(list.contains("shubham")); // false
		System.out.println(list);
		System.out.println(amount);

	}

}
