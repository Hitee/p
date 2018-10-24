package com.capg.cms.ui;

import java.util.Random;
import java.util.Scanner;

import com.capg.cms.beans.Customer;
import com.capg.cms.service.CustomerServiceImp;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		StringBuffer sbT = new StringBuffer();
		CustomerServiceImp service = new CustomerServiceImp();
		
		while(true)
		{
		System.out.println("welcome to Banking");
		System.out.println("1. create account");
		System.out.println("2. show balance");
		System.out.println("3. deposit");
		System.out.println("4. withdraw");
		System.out.println("5. fund transfer");
		System.out.println("6. print transaction");
		System.out.println("7. exit");

		Scanner sc = new Scanner(System.in);
		//System.out.println(sc);
		int Choice = sc.nextInt();

		switch (Choice) 
		{
		case 1: 
			
			System.out.println("enter name");
			String name = sc.next();
			
			System.out.println("enter email id");
			String email = sc.next();
			
			System.out.println("enter address");
			String addr = sc.next();
			
			System.out.println("enter id proof number");
			String id = sc.next();
			
			
			System.out.println("enter mobile number");
			String mobile = sc.next();
			
			System.out.println("enter age");
			int age = sc.nextInt();
			
			
			Random rnd = new Random();
			int accountNo = 100000 + rnd.nextInt(900000);
			System.out.println(accountNo);
			
			Random rnd2 = new Random();
			int pin = 1000 + rnd.nextInt(9000);
			System.out.println(pin);
			
			System.out.println("enter initial balance");
			double balance = sc.nextInt();
		
			//handing objects to bean object after taking input from user
			Customer bean  = new Customer();
			
			
			bean.setName(name);
			
			boolean isValid1 = service.isValidEmailAddress(email);
			if(isValid1 == true)
				{
				//System.out.println(isValid1);
				bean.setEmailId(email);
				}
			else System.out.println("invalid email id");
			bean.setAddr(addr);
			bean.setId(id);
			bean.setAge(age);
			
			if (mobile.matches("[0-9]{10}")) {
			  
				bean.setMobileNo(mobile);
			}
			else System.out.println("invalid mobile number");
			
			bean.setAccountNo(accountNo);
			bean.setPin(pin);
			bean.setBalance(balance);
			
	//	bean.setSb();
			
		boolean isValid = true;
			//boolean isValid = service.validateData(bean);
			
			/*if(isValid)
			{
			*/	long a = bean.getAccountNo();
				boolean isAdded = service.addCustomer(a, bean);
				//if(isAdded)
				//{
					System.out.println("account created !");
					System.out.println(bean);
				//}
				/*else
				{
					System.out.println("account NOT created!");
				}*/
				
			/*//}
			//else
			//{
				System.out.println("invalid data, please enter correct data");
			//	System.out.println(bean);
			}*/
			break;
			
		case 2:
			
			
			
			System.out.println("enter account number and pin to show balance");
			
			
			System.out.println("enter account number");
			long accountNo2 = sc.nextLong();
			
			System.out.println("enter pin");
			int pin2 = sc.nextInt();
			
			
			
			
			//boolean valid = service.validateCid(id);
			boolean valid = true;
			
			if(valid)
			{
				Customer c = service.displayCustomer(accountNo2, pin2);
				System.out.println(c.getBalance());
				/*if(c != null)
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
				}*/
			}
			

			break;
		case 3:
			 
		//	StringBuffer sb = new StringBuffer();
			
			/*Customer ca = new Customer();
			StringBuffer sb = ca.getSb();*/
			System.out.println("enter account number and amount to be deposited");
			
			System.out.println("enter account no");
			long accountNo3 = sc.nextLong();
			
			System.out.println("enter amount to be deposited");
			double depositAmount = sc.nextDouble();
			
		
			Customer c = service.deposit(accountNo3, depositAmount, sb);
			System.out.println("your balance is now: ");
			System.out.println(c.getBalance());
			
			
			
			break;
			
			
		case 4:
			System.out.println("enter account number and pin to proceed");
			
			System.out.println("enter account number");
			long accountNo4 = sc.nextLong();

			System.out.println("enter pin");
			int pin4 = sc.nextInt();
			
			System.out.println("enter amount to be withdrawn");
			double withdrawAmount = sc.nextDouble();
			
			Customer c1 = service.withdraw(accountNo4 , pin4 , withdrawAmount, sb);
			System.out.println("your balance is now: ");
			System.out.println(c1.getBalance());
			
			break;

			
		case 5:
			System.out.println("enter your account number");
			long accountNo5 = sc.nextLong();
			
			System.out.println("enter your pin");
			int pin5 = sc.nextInt();
			
			System.out.println("enter account number to which you want to transfer amount");
			long accountNoTransfer = sc.nextLong();
			
			System.out.println("enter amount");
			double amountTransfer = sc.nextDouble();
			
			
			Customer c2 = service.fundTransfer(accountNo5 , pin5 , accountNoTransfer , amountTransfer, sb, sbT);
			//System.out.println("amount transfered to: " + c2.getAccountNo());
			System.out.println("amount transfered to: " + accountNoTransfer);
			System.out.println("balance: " + c2.getBalance());
			
			
			
			
			break;
			
		case 6:
			System.out.println("enter account number and pin to print transactions");
			
			System.out.println("enter your account number");
			long accountNo6 = sc.nextLong();
			
			System.out.println("enter your pin");
			int pin6 = sc.nextInt();
			
			Customer c3 = service.printTransactions(accountNo6 , pin6);
			System.out.println(c3);
			
			break;
		case 7:
			System.exit(0);
			
			break;
		default:
			break;
		}

	}
		
	}

}
