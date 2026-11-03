package com.whatapp.message;

import java.io.Serializable;

public class EmployeeMgmt implements Serializable
{

	private static final long serialVersionUID = 1L;
	private String employeeId;
	private String employeeName;
	private double salary;
	private transient String password;  // skipp the 
	
	public EmployeeMgmt(String employeeId, String employeeName, double salary, String password) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.password = password;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
      }
