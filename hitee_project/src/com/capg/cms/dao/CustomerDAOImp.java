package com.capg.cms.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.capg.cms.beans.Customer;

public class CustomerDAOImp implements ICustomerDAO {
//StringBuffer sb = new StringBuffer();
	//for database use collections
	//public static List<Customer> custList = new ArrayList<Customer>();
	Map<Long, Customer> custList = new HashMap<Long, Customer>();
	Map<Long, StringBuffer> transaction = new HashMap<Long, StringBuffer>();
	//custList.put(1,bean);
	
	@Override
	public boolean addCustomer(long accNo, Customer c) 
	{
		// TODO Auto-generated method stub
		
		boolean isAdded = false;
	
		// add - predefined method of collections, returns boolean value
		custList.put(accNo,c);
		System.out.println("this is custlist" + custList);
		
		return isAdded;
	
	
	}

	//@Override
	public Customer displayCustomer(long accountNo , int pin) 
	{
		// TODO Auto-generated method stub
		System.out.println("hiii");
		Customer cust = null;
		for (Customer custList1 : custList.values() ) 
		{
		if(custList1.getAccountNo() == accountNo && custList1.getPin() == pin)
		{
			System.out.println("inside ");
			 System.out.println("Value = " + custList1.getBalance());
		}
		else System.out.println("nnn");
		   
		}
		//Iterator<Long,Customer> it = custList.iterator();
		/*for(Customer c : custList)
		{
			if(c.getAccountNo() == accountNo && c.getPin() == pin)
			{
				cust = c;
			}
		}*/
		
		
		return cust;
	}
	
	
	
	public Customer deposit(long accountNo , double depositAmount, StringBuffer sb , Customer c11) 
	{
		// TODO Auto-generated method stub
		
		Customer cust = null;
		
		for (Customer custList : custList.values()) 
		{
		if(custList.getAccountNo() == accountNo)
		{
			 System.out.println("Value = " + custList.getBalance());
		}
		   
		}
		
	
		//
		for(Customer custList : custList.values())
		{
			if(custList.getAccountNo() == accountNo)
				
		
			{
				
				double amt = custList.getBalance();
				
				
				amt = amt + depositAmount;
				custList.setBalance(amt);
				
				//StringBuffer sb = new StringBuffer();
				StringBuffer s1 = c11.getSb();
				s1.append("amount deposited: ");
				s1.append("hitee");
				s1.append(depositAmount );
				c11.setSb(s1);
				transaction.put(accountNo, c11.getSb());
				System.out.println("custList.getSb()" + c11.getSb());
				System.out.println(".......");
				System.out.println(transaction);
				
				cust = custList;
			}
		}
		
		
		return cust;
	}
	
	
	
	public Customer withdraw(long accountNo , int pin , double withdrawAmount, StringBuffer sb) 
	{
		// TODO Auto-generated method stub
		
		Customer cust = null;
		
		for (Customer custList : custList.values()) 
		{
		if(custList.getAccountNo() == accountNo)
		
		/*for(Customer c : custList)
		{
			if(c.getAccountNo() == accountNo && c.getPin() == pin )*/
			{
				double amt = custList.getBalance();
				if(withdrawAmount < amt)
				{
					amt = amt - withdrawAmount;
					//StringBuffer a = custList.getSb();
					//a.append(" amount WITHDRAWN is: " + withdrawAmount);
					//System.out.println(a);
					custList.setBalance(amt);
					cust = custList;
					
					
					
				}
				
			}
		}
		
		return cust;
		
	}
	
	
	public Customer fundTransfer(long accountNo , int pin, long accountNoTransfer , double amountTransfer, StringBuffer sb, StringBuffer sbT)
	{
		Customer cust = null;
		
		for (Customer custList1 : custList.values()) 
		{
			//Customer tr = new Customer();
		if(custList1.getAccountNo() == accountNo && custList1.getPin() == pin /*&& tr.getAccountNo()== accountNoTransfer*/)
		//	if(custList.containsKey(accountNo) && custList.containsKey(pin))
		
		/*for(Customer c : custList)
		{
			if(c.getAccountNo() == accountNo && c.getPin() == pin )*/
			{
				double amt = custList1.getBalance();
				if(amountTransfer < amt)
				{
					System.out.println("dwdwdwe");
					double from = custList1.getBalance();
					from = from - amountTransfer;
					//custList1.setBalance(from);
					//for(Customer c1 : custList.values())
					//for (Customer custList : custList.values()) 
					for (Customer custList2 : custList.values()) 
					{
					if(custList.containsKey(accountNoTransfer) && custList.containsKey(accountNo))
					{
						double to = custList2.getBalance();
						to = to + amountTransfer;
						custList2.setBalance(to);
						custList1.setBalance(from);
						cust = custList1;
						System.out.println("aaaaaaaaa");
						
						System.out.println(custList2.getBalance());
						
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
	
	public Customer printTransactions(long accountNo , int pin)
	{
		Customer cust = null;
		System.out.println("inside print transaction");
		for(StringBuffer transaction1 : transaction.values())
		{
			
			transaction.entrySet().stream().forEach(System.out::println);
			System.out.println("aaaaaaa");
			System.out.println(transaction);
		}
		return cust;
	}
	
	
	
	

}
