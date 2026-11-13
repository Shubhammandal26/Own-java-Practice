package com.kodewala.single;

public class Service {

	public static void main(String[] args)
	{
		EmployeeService service = new EmployeeService();
		service.addEmployee("Rahul", 45000);
		
		SalaryService salaryService = new SalaryService();
		salaryService.calculateService(45000);
		
		EmailService email = new EmailService();
		email.sendEmail("rahul@gmail.com");

	}

}
