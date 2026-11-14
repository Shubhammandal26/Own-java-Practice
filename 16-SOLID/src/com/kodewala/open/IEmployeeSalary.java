package com.kodewala.open;

public interface IEmployeeSalary
{
	void calculateSalary(double salary);

}

class PermanentEmployee implements IEmployeeSalary
{
	@Override
	public void calculateSalary(double salary) {
		System.out.println("Salary: " + salary);
		
	}
}

class ContractEmployee implements IEmployeeSalary
{
	@Override
	public void calculateSalary(double salary) {
		System.out.println("Salary per day: " + salary);
		
	}
}

class Intern implements IEmployeeSalary
{
	@Override
	public void calculateSalary(double salary) {
		System.out.println("Stipend: " + salary);
		
	}
}
class FreelancerEmployee implements IEmployeeSalary {

    @Override
    public void calculateSalary(double salary) {
        System.out.println("Freelancer Payment: " + salary);
    }
}

 class EmployeeSalaryService
 {
	 public void processingSalary(IEmployeeSalary salary, double amount)
	 {
		 salary.calculateSalary(amount);
	 }
 }
