package com.capg.cms.ui;

import org.junit.Assert;

import com.capg.cms.beans.Customer;
import com.capg.cms.dao.ICustomerDAO;
import com.capg.cms.expection.CustomerNotFound;

public class ClientTest {
	static ICustomerDAO cust=null;
	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	public void test() 
	{
		/*Employee employee=new Employee();
		employee.setName("tarun");
		employee.setMail("t@gmail.com");
		employee.setMobile("8877");
		employee.setSal(54444);*/
		Customer cust = new Customer();
		//long acc = cust.getAccountNo();
		
		/*try {
			
			Assert.assertEquals("failure  ",cust.getAccountNo(),cust.getAccountNo());
		} catch (CustomerNotFound | NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
	}

}
