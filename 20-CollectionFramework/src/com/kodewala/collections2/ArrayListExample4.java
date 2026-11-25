package com.kodewala.collections2;

import java.util.ArrayList;

public class ArrayListExample4 {

	public static void main(String[] args) 
	{
		ArrayList<String> learner = new ArrayList<String>();
		
		learner.add("Rakesh");
		learner.add("Ram");
		learner.add("Rahul");
		learner.add("Amit");
		learner.add("Aman");
		learner.add("Suresh");
		learner.add("Rohit");
		learner.add(null);
		learner.add(null);
		learner.add(null);
		
		System.out.println(learner.size());

	}

}
