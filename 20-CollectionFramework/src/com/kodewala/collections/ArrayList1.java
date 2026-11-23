package com.kodewala.collections;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) 
	{
		ArrayList<String> learner = new ArrayList<String>();
		
		
		learner.add("shubham");  // Maintains insertion order.
		learner.add("goutam");  
		learner.add("ramesh");
		learner.add("aman");
		learner.add("rahul");
		learner.add("shubham"); // duplicate
		learner.add("rahul");   // duplicate
		learner.add(null);     // allow multiple null
		learner.add(null);     // allow multiple null
		
		System.out.println(learner);

	}

}
