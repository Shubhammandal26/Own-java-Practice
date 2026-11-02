
   package com.kodewala.types;
   
   @FunctionalInterface
   interface IAccount
   {
   public abstract String openAccount(String name, String address, int balance);
	}
	
	class Driver
	{
	public static void main(String[] args)
	{
	 IAccount account = (name, add, amt) ->
	 {
	  System.out.println("Opening Account...");
	  return "Name: " + name + ", Address:"  + add + ", Balance:" + amt;
	};
	String result = account.openAccount("Shubham", "Hata",1500);
	System.out.println(result);
	
	}
	}