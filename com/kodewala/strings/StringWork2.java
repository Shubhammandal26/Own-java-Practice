
   package com.kodewala.strings;
	
	class StringWork2
	{
	  public static void main(String[] args)
	{
	 String str1 = "Banglore";
	 String str2 = new String("Banglore");
	 String str3 = str2.intern();
	 
	 System.out.println("The result of (str1 == str2): " + (str1 == str2));  // false
	 System.out.println("The result of (str1.equals(str2)): " + str1.equals(str2));  // true
	 System.out.println("The result of (str1 == str3): " + (str1 == str3)); // true
	
	}
	}