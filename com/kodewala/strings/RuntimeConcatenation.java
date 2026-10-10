
   package com.kodewala.strings;
	
	class RuntimeConcatenation 
	{
	public static void main(String[] args)
	{
	  String s1 = "Java";
      String s2 = s1 + " Backend";
      String s3 = "Java Backend";

      System.out.println(s2 == s3); //false
      System.out.println(s2.equals(s3)); // true
	
	}
	}
   