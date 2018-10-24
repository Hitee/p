package com.capg.cms.dao;

import com.capg.cms.beans.Customer;

public interface ICustomerDAO {
	
	//same as in service
	
	public boolean addCustomer(Customer c);
	public Customer displayCustomer(int cid);
	
	
	
	

}
