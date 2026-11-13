package com.kodewala.cloning1;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Address address = new Address("Bangalore", "Karnatka");
		Employee emp = new Employee(101, "Rahul", address);
		
		System.out.println("Original Employee: ");
		System.out.println("ID: " + emp.employeeId);
		System.out.println("Name: " + emp.employeeName);
		System.out.println("City: " + address.city);
		
		Employee clonedEmp = (Employee) emp.clone();
		clonedEmp.address.city = "Hyderabad";
		
		System.out.println("Cloned Employee: ");
		System.out.println("ID: " + clonedEmp.employeeId);
		System.out.println("Name: " + clonedEmp.employeeName);
		System.out.println("City: " + clonedEmp.address.city);
		
		System.out.println("Original Employee After Cloning: ");
		System.out.println("Name: " + emp.employeeName);
		System.out.println("City: " + emp.address.city);

	}

}
