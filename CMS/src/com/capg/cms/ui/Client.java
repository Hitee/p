package com.capg.cms.ui;

import java.util.List;
import java.util.Scanner;

import com.capg.cms.beans.Customer;
import com.capg.cms.dao.CustomerDAOImp;
import com.capg.cms.expection.CustomerNotFound;
import com.capg.cms.service.CustomerServiceImp;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerServiceImp service = new CustomerServiceImp();
		
		while(true)
		{
		System.out.println("welcome to CMS");
		System.out.println("1. add customer");
		System.out.println("2. display part. customer");
		System.out.println("3. display all customers");
		System.out.println("4. exit");

		Scanner sc = new Scanner(System.in);
		int Choice = sc.nextInt();

		switch (Choice) 
		{
		case 1: 
			
			System.out.println("enter customer id");
			int cid = sc.nextInt();
						
			System.out.println("enter customer name");
			String cname = sc.next();
			
			System.out.println("enter address");
			String addr = sc.next();
			
			
			//handing objects to bean object after taking input from user
			Customer bean  = new Customer();
			
			bean.setCid(cid);
			bean.setCname(cname);
			bean.setAddr(addr);
			System.out.println(bean);
			
		/*
			boolean isValid = service.validateData(bean);
			
			if(isValid)
			{
				boolean isAdded = service.addCustomer(bean);
				if(isAdded)
				{
					System.out.println("record added !");
					System.out.println(bean);
				}
				else
				{
					System.out.println("record NOT added!");
				}
				
			}
			else
			{
				System.out.println("invalid data, please enter correct data");
			//	System.out.println(bean);
			}*/
			break;
			
		case 2:
			
			
			System.out.println("enter customer id to display record");
			
			int id = sc.nextInt();
			
			boolean valid = service.validateCid(id);
			
			if(valid)
			{
				Customer c = service.displayCustomer(id);
				
				if(c != null)
				System.out.println(c);
				else
				{
					try 
					{
						throw new CustomerNotFound();
						
						
					} catch (CustomerNotFound e) 
					{
						e.printStackTrace();
						// TODO: handle exception
					}	
				}
			}
			

			break;
		case 3:
			
			/*Customer c = service.displayAll();
			System.out.println(c);*/
			
			//System.out.println(c);
			service.displayAll();
			
			
			break;
		case 4:
			System.exit(0);

			break;

		default:
			break;
		}

	}
		
	}

}
