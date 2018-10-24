package com.capg.cms.service;

import java.util.Iterator;

import com.capg.cms.beans.Customer;
import com.capg.cms.dao.CustomerDAOImp;

public class CustomerServiceImp implements ICustomerService {

	CustomerDAOImp dao = new CustomerDAOImp();
	
	
	@Override
	public boolean addCustomer(Customer c) {
		// TODO Auto-generated method stub
		return dao.addCustomer(c);
	}

	@Override
	public Customer displayCustomer(int cid) {
		// TODO Auto-generated method stub
		return dao.displayCustomer(cid);
	}
	

	
	
	public boolean validateData(Customer c)
	{
		
		boolean flag = false;
		
		if(c.getCid() > 99 && c.getCname().length() >= 4 && c.getAddr().equals("chennai"))
		{
			flag = true;
		}
		
		return flag;
	}
	
	public boolean validateCid(int cid)
	{
		boolean flag = false; 
		if(cid > 99)
		{
			flag =  true;
		}
		return flag;
	}
	/*
	public Customer displayAll()
	{
		return dao.displayAll();
		
	}*/
	public void displayAll()
	{
		dao.displayAll();
		
	}
}
