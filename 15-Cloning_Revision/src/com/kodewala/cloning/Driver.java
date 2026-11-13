package com.kodewala.cloning;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Address address = new Address("16th main road", "2nd Cross", "Bengaluru");
		Employee emp = new Employee("Kodewala", "KOW123", address);
		
		Employee clonedEmp = (Employee) emp.clone();
		emp.address.city = "Chennai";
		System.out.println(emp.address.city);
		System.out.println(clonedEmp.address.city);

	}

}
