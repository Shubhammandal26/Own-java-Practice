package com.kodewala.clean;

public class EDriver {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		EAddress add = new EAddress("Karnatka", "Bengaluru", "560029");
		
		EEmployee emp1 = new EEmployee("Shubham", "KOD11", "Backend", add);
		
		EEmployee clonedEmp = (EEmployee) emp1.clone();
		
//		 Shallow Cloning
//		System.out.println("Cloned Employee");
//		System.out.println("Employee Name: " + clonedEmp.empName);
//		System.out.println("Employee ID: " + clonedEmp.empId);
//		System.out.println("Department: "  + clonedEmp.department);
//		
//		clonedEmp.empName = "Rahul";
//		clonedEmp.address.city = "Mumbai";
		
//		System.out.println("Original Name: " + emp1.empName); // Shubham
//		System.out.println("Cloned Name: " + clonedEmp.empName); // Rahul
//		
//		System.out.println("Original City: " + emp1.address.city); // Mumbai
//		System.out.println("Cloned City: " + clonedEmp.address.city); // Mumbai

//		 Deep Cloning
		clonedEmp.empName = "Rahul";
        clonedEmp.address.city = "Mumbai";

        System.out.println("Original Employee");
        System.out.println("Name: " + emp1.empName);
        System.out.println("City: " + emp1.address.city);

        System.out.println("\nCloned Employee");
        System.out.println("Name: " + clonedEmp.empName);
        System.out.println("City: " + clonedEmp.address.city);
	}

}
