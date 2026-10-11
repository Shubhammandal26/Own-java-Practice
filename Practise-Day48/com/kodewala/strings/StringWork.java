  
    package com.kodewala.strings;
	
	class StringWork
	{
	  public static void main(String[] args)
	{
	 String str1 = "Banglore";
	 String str2 = new String("Banglore");
	 
	 System.out.println(str1 == str2);  // false
	 System.out.println(str1.equals(str2));  // true
	
	}
	}