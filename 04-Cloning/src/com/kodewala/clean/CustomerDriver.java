package com.kodewala.clean;

public class CustomerDriver {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		AccountDetails account = new AccountDetails("Saving", "452310118301", "Bengaluru");
		
		Customer customer = new Customer("C101", "Rahul", "shubham@gmail.com", account);

		Customer clonedCus = (Customer) customer.clone();
		
//		System.out.println("Cloned Customer: ");
//		System.out.println("Customer ID: " + clonedCus.customerId);
//		System.out.println("Customer Name: " + clonedCus.customerName);
//		System.out.println("Email: " + clonedCus.email);
//
//		 clonedCus.customerName = "Shubham";
//		 clonedCus.accountDetails.branch = "Mumbai";
//		 
//		 System.out.println("Original Customer:");
//		 System.out.println("Customer Name: " + customer.customerName);
//		 System.out.println("Branch: " + customer.accountDetails.branch);
//
//		 System.out.println("\nCloned Customer:");
//		 System.out.println("Customer Name: " + clonedCus.customerName);
//		 System.out.println("Branch: " + clonedCus.accountDetails.branch);
		
		clonedCus.customerName = "Shubham";
		clonedCus.accountDetails.branch = "Mumbai";
		
		System.out.println("Original Employee");
        System.out.println("Customer Name: " + customer.customerName);
        System.out.println("Branch: " + customer.accountDetails.branch);

        System.out.println("\nCloned Employee");
        System.out.println("Customer Name: " + clonedCus.customerName);
        System.out.println("Branch: " + clonedCus.accountDetails.branch);
		
	}

}
