package com.tcs.emp;

public class AddressMgmt implements Cloneable
{
	String street;
	String city;
	String pincode;
	
	public AddressMgmt(String street, String city, String pincode) {
		super();
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
  }
