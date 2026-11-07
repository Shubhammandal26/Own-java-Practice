package com.kodewala.strings;

public class StringExample {

	public static void main(String[] args) 
	{
		String s1 = new String("kodewala");
		String s2 = new String("kodewala");
		
		System.out.println(s1 == s2); // compare address of an object
		System.out.println(s1.equals(s2)); // compare content

	}

}
