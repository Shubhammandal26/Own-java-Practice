package com.kodewala.clean;

public class Customer  implements Cloneable
{
	String customerId;
	String customerName;
	String email;
	AccountDetails accountDetails;
	
	public Customer(String customerId, String customerName, String email, AccountDetails accountDetails) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.accountDetails = accountDetails;
	}
	
//	@Override
//	public Object clone() throws CloneNotSupportedException
//	{
//		return super.clone();  // Shallow Cloning
//	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Customer clonedCus = (Customer) super.clone();
		clonedCus.accountDetails = (AccountDetails) accountDetails.clone();
		return clonedCus;
		
	}

}
