package com.kodewala.collections;

public class EmployeeDriver {

	public static void main(String[] args) 
	{
		EmployeeService service = new EmployeeService();
		
		service.addEmployee();
		
		service.displayEmployee();
		
		service.getEmployeeByIndex(0);
		
		service.updateEmployee(0);
		
		service.getTotalEmployees();
		
		service.searchEmployee(0);

	}

}
