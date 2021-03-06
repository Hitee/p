package com.capg.cms.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

	//@Override
	public Customer displayCustomer(long accountNo , int pin) 
	{
		// TODO Auto-generated method stub
		
		Customer cust = null;
		for(Customer c : custList)
		{
			if(c.getAccountNo() == accountNo && c.getPin() == pin)
			{
				cust = c;
			}
		}
		
		
		return cust;
	}
	
	
	
	public Customer deposit(long accountNo , double depositAmount) 
	{
		// TODO Auto-generated method stub
		
		Customer cust = null;
		for(Customer c : custList)
		{
			if(c.getAccountNo() == accountNo)
			{
				double amt = c.getBalance();
				amt = amt + depositAmount;
				c.setBalance(amt);
				cust = c;
			}
		}
		
		
		return cust;
	}
	
	
	
	public Customer withdraw(long accountNo , int pin , double withdrawAmount) 
	{
		// TODO Auto-generated method stub
		
		Customer cust = null;
		for(Customer c : custList)
		{
			if(c.getAccountNo() == accountNo && c.getPin() == pin )
			{
				double amt = c.getBalance();
				if(withdrawAmount < amt)
				{
					amt = amt - withdrawAmount;
					c.setBalance(amt);
					cust = c;
					
				}
				
			}
		}
		
		return cust;
		
	}
	
	
	public Customer fundTransfer(long accountNo , int pin, long accountNoTransfer , double amountTransfer)
	{
		Customer cust = null;
		for(Customer c : custList)
		{
			if(c.getAccountNo() == accountNo && c.getPin() == pin )
			{
				double amt = c.getBalance();
				if(amountTransfer < amt)
				{
					System.out.println("dwdwdwe");
					double from = c.getBalance();
					from = from - amountTransfer;
					c.setBalance(from);
					for(Customer c1 : custList)
					{
					if(c1.getAccountNo() == accountNoTransfer)
					{
						double to = c1.getBalance();
						to = to + amountTransfer;
						c1.setBalance(to);
						cust = c1;
						System.out.println("aaaaaaaaa");
						
						System.out.println(c1.getBalance());
						
					}
					else 
					{
						System.out.println("sssssssss");
					}
					}
					
				}
				
			}
		}
		
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
	
	
	/*public boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
 }*/
	

}
