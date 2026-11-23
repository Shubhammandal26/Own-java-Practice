package com.kodewala.collections;

import java.util.ArrayList;

public class ArrayListExample3 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		number.add(12);
		number.add(20);
		number.add(30);
		number.add(40);
//		number.remove(3);
		number.set(0, 50);
		
		System.out.println("Size: " + number.size());
		System.out.println("Elements in ArrayList: " + number);

	}

}
