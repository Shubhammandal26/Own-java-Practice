package com.kodewala.collections2;

import java.util.ArrayList;

public class ArrayListExample3 {

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>(12);
		
		list.add("Rahul");
		list.add("Amit");
		list.add("Shubham");
		list.add("Aman");
		list.add("Lalit");
		list.add("Ritesh");
		list.add("Pappu");
		list.add("Rahul");
		list.add("Amit");
		list.add("Shubham");
		list.add("Aman");
		list.add("Lalit");
		
//		list.remove(2);
		
		System.out.println(list.size());
		System.out.println(list.get(2));
		

	}

}
