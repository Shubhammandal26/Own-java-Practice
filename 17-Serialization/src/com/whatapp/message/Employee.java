package com.whatapp.message;

import java.io.Serializable;

public class Employee implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	private String userName;
	private int rollNo;
	
	public Employee(String userName, int rollNo) {
		super();
		this.userName = userName;
		this.rollNo = rollNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
   }
