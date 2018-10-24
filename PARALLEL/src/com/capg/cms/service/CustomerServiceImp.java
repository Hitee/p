package com.capg.cms.service;

import com.capg.cms.beans.Customer;
import com.capg.cms.dao.CustomerDAOImp;

public class CustomerServiceImp implements ICustomerService {

	CustomerDAOImp dao = new CustomerDAOImp();
	
	
	@Override
	public boolean addCustomer(Customer c) {
		// TODO Auto-generated method stub
		return dao.addCustomer(c);
	}

	//@Override
	public Customer displayCustomer(long accountNo, int pin) {
		// TODO Auto-generated method stub
		return dao.displayCustomer(accountNo , pin);
	}
	
	
	public Customer deposit(long accountNo, double depositAmount, StringBuffer sb) {
		// TODO Auto-generated method stub
		return dao.deposit(accountNo , depositAmount, sb);
	}

	
	public Customer withdraw(long accountNo, int pin , double withdrawAmount, StringBuffer sb) {
		// TODO Auto-generated method stub
		return dao.withdraw(accountNo , pin , withdrawAmount, sb);
	}
	
	
	public Customer fundTransfer(long accountNo , int pin, long accountNoTransfer , double amountTransfer, StringBuffer sb, StringBuffer sbT)
	{
		// TODO Auto-generated method stub
		return dao.fundTransfer(accountNo , pin , accountNoTransfer , amountTransfer, sb , sbT);
	}
	
	
	
	public boolean validateData(Customer c)
	{
		
		boolean flag = false;
		
		/*if(c.getCid() > 99 && c.getCname().length() >= 4 && c.getAddr().equals("chennai"))
		{
			flag = true;
		}*/
		
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
	
	public boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
 }
	
	
	/*public boolean phonenumber(inputtxt)
	{
	  int phoneno = ;
	  if((inputtxt.value.match(phoneno))
	        {
	      return true;
	        }
	      else
	        {
	        alert("message");
	        return false;
	        }
	}*/

	/*
	public Customer displayAll()
	{
		return dao.displayAll();
		
	}*/
	
	public Customer printTransactions(long accountNo5 , int pin5)
	{
		return dao.printTransactions(accountNo5, pin5);
	}
	
	public void displayAll()
	{
		dao.displayAll();
		
	}

	@Override
	public Customer displayCustomer(int cid) {
		// TODO Auto-generated method stub
		return null;
	}
}
