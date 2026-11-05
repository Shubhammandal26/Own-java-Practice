package com.kodewala.emp;

public class Address implements Cloneable
{
	String line1;
	String layout;
	String city;
	
	public Address(String line1, String layout, String city) {
		super();
		this.line1 = line1;
		this.layout = layout;
		this.city = city;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}
