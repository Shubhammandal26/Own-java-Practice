package com.kodewala.strings;

public class StringMutuability {

	public static void main(String[] args)
	{
		String s1 = "kodewala";
		String s2 = s1.concat(" Academy");
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		
		System.out.println("Are s1 and s2 are same? " + (s1 == s2));

	}

}
