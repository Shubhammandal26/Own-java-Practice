package com.revision.oops;

class Registration
{
	void doRegistration(String aadhar)
	{
		System.out.println("Registered using aadhar: " + aadhar);
	}
	
	void doRegistration(String mobile, int otp)
	{
		System.out.println("Registered using mobile: " + mobile + " with OTP: " + otp);
	}
	
	void doRegistration(String name, String email)
	{
		System.out.println("Registered using name: " + name + " and Email: " + email);
	}
	
	void doRegistration(int otp, String mobile)
	{
		System.out.println("Registered using OTP: " + otp + " and Mobile: " + mobile);
	}
}
public class MethodOverloadingExample {

	public static void main(String[] args) 
	{
	  Registration reg = new Registration();
	  reg.doRegistration("1234-5678-9012");
	  reg.doRegistration("9874561230", 4512);
	  reg.doRegistration("John Doe", "john@email.com");
	  reg.doRegistration(4100, "9874561230");
    
	}

}
