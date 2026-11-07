package com.kodewala.strings;

public class StringInternExample {

	public static void main(String[] args)
	{
		String s1 = "kodewala Academy";
		String s2 = new String("kodewala Academy");
		
		System.out.println(s1 == s2);
		
		String s3 = s2.intern();
		System.out.println(s1 == s3); 

	}

}
