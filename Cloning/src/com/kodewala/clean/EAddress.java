package com.kodewala.clean;

public class EAddress implements Cloneable {
	String state;
	String city;
	String pincode;
	
	public EAddress(String state, String city, String pincode) {
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
