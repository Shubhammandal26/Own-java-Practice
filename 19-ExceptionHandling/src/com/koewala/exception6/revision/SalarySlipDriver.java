package com.koewala.exception6.revision;

public class SalarySlipDriver {

	public static void main(String[] args) 
	{
		Employee emp = new Employee(101, "shiv", 85000);
		
		SalarySlipService service = new SalarySlipService();
		service.generateSalarySlip(emp);

	}

}
