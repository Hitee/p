package com.capg.cms.dao;

import com.capg.cms.beans.Customer;

public interface ICustomerDAO{
	
	//same as in service
	
//	public boolean addCustomer(Customer c);
	public Customer displayCustomer(long accountNo, int pin);
	boolean addCustomer(long accNo, Customer c);
	public Customer printTransactions(long accountNo , int pin);
	public Customer deposit(long accountNo, double depositAmount, StringBuffer sb, Customer c11);
	
	

}
