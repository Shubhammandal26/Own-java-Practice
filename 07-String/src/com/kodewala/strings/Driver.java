package com.kodewala.strings;

class User
{
	String firstName;
	
	User(String firstName)
	{
		this.firstName = firstName;
	}
}
public class Driver {

	public static void main(String[] args) 
	{
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		User user1 = new User("kodewala");
		User user2 = new User("kodewala");
		
		System.out.println(user1.equals(user2));

	}

}
