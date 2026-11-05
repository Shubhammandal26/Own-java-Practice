package com.kodewala.clean;

public class EmployeeDriver {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Addresses address = new Addresses("Jharkhand", "Jamshedpur", "831007");
		
		EmployeeAdd empAdd = new EmployeeAdd("EMP120", "Shubham", "Java Developer", address);
		
		 EmployeeAdd clonedEmp =  (EmployeeAdd) empAdd.clone();
		 
//		 System.out.println(clonedEmp.addresses.city);
		 System.out.println(empAdd.addresses.city);
		 System.out.println(clonedEmp.addresses.city);

	}

}
