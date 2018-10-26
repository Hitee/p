package com.capg.cms.service;

import com.capg.cms.beans.Customer;

public interface ICustomerService {
	
	
	
	//public boolean addCustomer(Customer c);
	public Customer displayCustomer(int cid);
	boolean addCustomer(long accNo, Customer c);
	public Customer printTransactions(long accountNo , int pin);
	public Customer deposit(long accountNo, double depositAmount, StringBuffer sb, Customer c11);
	

}
