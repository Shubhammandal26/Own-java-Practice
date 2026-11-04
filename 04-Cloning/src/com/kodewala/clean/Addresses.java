package com.kodewala.clean;

public class Addresses implements Cloneable
{
	String state;
	String city;
	String pincode;
	
	
	public Addresses(String state, String city, String pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
		
	}
}
