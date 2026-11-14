package com.kodewala.open;

public class EmployeeSalary {

	public static void main(String[] args) 
	{
		EmployeeSalaryService service = new EmployeeSalaryService();
		service.processingSalary(new PermanentEmployee(), 50000);
		service.processingSalary(new ContractEmployee(), 2000);
		service.processingSalary(new Intern(), 15000);
		service.processingSalary(new FreelancerEmployee(), 30000);

	}

}
