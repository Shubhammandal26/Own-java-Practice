package com.kodewala.clean;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Address address = new Address("16th Main", " 2nd cross", "Bangalore");
		
		Employee emp1 = new Employee("Shubham", "Kod12", address);
		
		Employee cloneEmp = (Employee) emp1.clone();
		
		emp1.address.city = "Hyd";
		
		System.out.println(emp1.address.city);
		System.out.println(cloneEmp.address.city);
		
	}

}
