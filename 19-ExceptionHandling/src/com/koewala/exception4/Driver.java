package com.koewala.exception4;

public class Driver {

	public static void main(String[] args) 
	{
		Driver d = new Driver();
        d.m1();
	}
	
	public void m1()
	{
		System.out.println("Driver.m1()");
		m2();
	}
	
	public void m2()
	{
		System.out.println("Driver.m2()");
		m1();
	}

}
