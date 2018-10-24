package com.capg.cms.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.internal.matchers.Each;

import com.capg.cms.beans.Customer;

public class CustomerDAOImp implements ICustomerDAO {

	//for database use collections
	public static List<Customer> custList = new ArrayList<Customer>();
	
	
	@Override
	public boolean addCustomer(Customer c) 
	{
		// TODO Auto-generated method stub
		
		boolean isAdded = false;
	
		// add - predefined method of collections, returns boolean value
		isAdded = custList.add(c);
		return isAdded;
	
	
	}

	@Override
	public Customer displayCustomer(int cid) 
	{
		// TODO Auto-generated method stub
		
		Customer cust = null;
		for(Customer c : custList)
		{
			if(c.getCid() == cid)
			{
				cust = c;
			}
		}
		
		//System.out.println(cust);
		return cust;
	}
	
	/*public Customer displayAll()
	{
		Customer c = null;
		Iterator<Customer> it = custList.iterator();
		while(it.hasNext())
		{
			 c = it.next();
			//System.out.println(c + " ");
			
		}
		return c;
		
	}*/
	public void displayAll()
	{
		Customer c = null;
		Iterator<Customer> it = custList.iterator();
		while(it.hasNext())
		{
			 c = it.next();
			System.out.println(c + " ");
			
		}
		//return c;
		
	}
	

}
