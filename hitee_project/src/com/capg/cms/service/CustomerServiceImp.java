package com.capg.cms.service;

import com.capg.cms.beans.Customer;
import com.capg.cms.dao.CustomerDAOImp;

import java.io.BufferedReader;
import java.util.regex.Matcher;
public class CustomerServiceImp implements ICustomerService {

	CustomerDAOImp dao = new CustomerDAOImp();
	
	
	@Override
	public boolean addCustomer(long accNo,Customer c){
		// TODO Auto-generated method stub
		return dao.addCustomer(accNo, c);
	}

	//@Override
	public Customer displayCustomer(long accountNo, int pin) {
		// TODO Auto-generated method stub
		return dao.displayCustomer(accountNo , pin);
	}
	
	
	public Customer deposit(long accountNo, double depositAmount, StringBuffer sb, Customer c11) {
		// TODO Auto-generated method stub
		return dao.deposit(accountNo , depositAmount, sb, c11);
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
	
	/*public void displayAll()
	{
		dao.displayAll();
		
	}*/

	@Override
	public Customer displayCustomer(int cid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean validateNumber(String mobile)
	{
		
		if (mobile.matches("[0-9]{10}")) {
			 return true; 
			
		}
		else System.out.println("invalid mobile number");
		return false;
	}
	
	public boolean validateAge(int age)
	{
		if (age>0)
			return true;
		else System.out.println("wrong age entered");
		return false;
	}
	
	public boolean validateId(String id)
	{
		if (id.matches("[0-9]{5}")) {
			 return true; 
			
		}
		else System.out.println("invalid id");
		return false;
	}
	
	public boolean validateBalance(double balance)
	{
		if(balance>0)
			return true;
		else 
			System.out.println("balance not valid ");
		return false;
	}
	
	/*public boolean validateName(StringBuffer name, BufferedReader input)
	{
		String a = name.toString();
		 Matcher mtch = name.matcher(a);
	        if(mtch.matches()){
	            return true;
	        }
	        return false;
	}*/
	
}
