package com.kodewala.emp;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Address address = new Address("10th Main", "1st Stage", "Bangaluru");
		
		Employee emp = new Employee("Shubham", "EMP201", address);
		
		Employee clonedEmp = (Employee) emp.clone();
		clonedEmp.address.city = "Chennai";
		System.out.println("Employee Name: " + clonedEmp.empName); // Shubham
		System.out.println("Employee Code: " + clonedEmp.empCode); //EMP201
		System.out.println("Original City: " + emp.address.city); // Chennai
		
		System.out.println("Employee City: " + clonedEmp.address.city); // Chennai
		

	}

}
