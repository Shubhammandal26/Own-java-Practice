
   package com.kodewala.strings;
	
	class StringImmutability 
	{
	public static void main(String[] args)
	{
	String s1 = "Hello";
    String s2 = s1.concat(" World");
    String s3 = s1;

    System.out.println(s1 == s3); // true
    System.out.println(s1 == s2); // false
    System.out.println(s1.equals(s2)); //false
	
	}
	}