package com.kodewala.cloning1;

public class Customer implements Cloneable
{
	String customerId;
	String customerName;
	AccountDetails accountDetails;
	
	public Customer(String customerId, String customerName, AccountDetails accountDetails) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.accountDetails = accountDetails;
	}
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Customer customer = (Customer) super.clone();
		customer.accountDetails = (AccountDetails) accountDetails.clone();
		return customer;
	}
 }
