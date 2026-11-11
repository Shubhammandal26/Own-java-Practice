package com.revision.oops;

class Person
{
	void showRole()
	{
		System.out.println("I am a person with multiple roles.");
	}
}

class Student extends Person
{
	@Override
	void showRole()
	{
		System.out.println("I am a student. I study and attend classes.");
	}
}

class Friends extends Person
{
	@Override
	void showRole()
	{
		System.out.println("I am a shivam and i spend times with my friends");
	}
}
public class PolymorphismExample {

	public static void main(String[] args)
	{
		Person person;
		person = new Student();
		person.showRole();
		
	  person = new Friends();
	  person.showRole();

	}

}
