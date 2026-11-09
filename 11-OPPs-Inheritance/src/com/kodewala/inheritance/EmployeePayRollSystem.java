package com.kodewala.inheritance;

class Employees
{
	int employeeId;
    String employeeName;
    double basicSalary;
    
	public Employees(int employeeId, String employeeName, double basicSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
	}
	
	public void calculateSalary()
	{
		System.out.println("Calculating Employee salary");
	}
}

class FullTimeEmployee extends Employees
{
    double allowances;
	public FullTimeEmployee(int id, String name, double salary, double allowances) 
	{
		super(id, name, salary);
		this.allowances = allowances;
	}
	@Override
    public void calculateSalary() {

        double totalSalary = basicSalary + allowances;

        System.out.println("Full Time Employee: " + employeeName);
        System.out.println("Salary: " + totalSalary);
    }	
}

class PartTimeEmployee extends Employees
{
	 int workingHours;
	 double hourlyRate;
	public PartTimeEmployee(int id, String name,  int workingHours, double hourlyRate)
	{
		super(id, name, 0);
		this.workingHours = workingHours;
		this.hourlyRate = hourlyRate;
	}
	@Override
    public void calculateSalary() {

        double totalSalary = workingHours * hourlyRate;

        System.out.println("Part Time Employee: " + employeeName);
        System.out.println("Salary: " + totalSalary);
    }
	
}
class ContractEmployee extends Employees {

    double contractAmount;

    ContractEmployee(int id, String name, double contractAmount) {

        super(id, name, 0);
        this.contractAmount = contractAmount;
    }

    @Override
    public void calculateSalary() {

        System.out.println("Contract Employee: " + employeeName);
        System.out.println("Salary: " + contractAmount);
    }
}

public class EmployeePayRollSystem {

	public static void main(String[] args) 
	{
		Employees[] employee = {
				new FullTimeEmployee(101, "Rahul", 30000, 5000),
				new PartTimeEmployee(102, "Amit", 100, 200),
				new ContractEmployee(103, "Shiv", 45000)
		};
		for(Employees emp: employee)
		{
			emp.calculateSalary();
			System.out.println("--------");
		}

	}

}
