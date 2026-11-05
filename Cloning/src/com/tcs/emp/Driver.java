package com.tcs.emp;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Address address = new Address("16th Main", "27th cross", "Bangalore");
		
		Employee emp = new Employee("Kodewala Academy", "KOD123", address);
		
	   Employee clonedEmp	= (Employee) emp.clone();
	   
	   clonedEmp.address.city = "Delhi";
	   System.out.println(emp.address.city); // Bangalore
	   System.out.println(clonedEmp.address.city);  // Delhi

	}

}
