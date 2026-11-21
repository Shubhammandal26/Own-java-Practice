package com.koewala.exception5.revision;

public class MatroMo 
{
	public void ageVerify(int age)
	{
		if(age > 60)
		{
			throw new TooOldException("You are not eligible under the application's age criteria");
		} else if(age <= 18)
		{
			throw new TooYoungException("You are too young to register");
		} else {
			System.out.println("You are eligible for marriage registration");
		}
	}

	
}
