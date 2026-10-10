

    package com.kodewala.strings;
	
	class StringIntetnExample
	{
	public static void main(String[] args)
	{
	String s1 = new String("Spring");
    String s2 = s1.intern();
    String s3 = "Spring";

    System.out.println(s1 == s2);
    System.out.println(s2 == s3);
	
	}
	}