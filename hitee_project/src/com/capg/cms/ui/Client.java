package com.capg.cms.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

import com.capg.cms.beans.Customer;
import com.capg.cms.service.CustomerServiceImp;


public class Client {
	//static Customer c11 = new Customer();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		StringBuffer sb = new StringBuffer();
		StringBuffer sbT = new StringBuffer();
		CustomerServiceImp service = new CustomerServiceImp();
		
		while(true)
		{
			System.out.println("WORKING");
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
			Customer bean  = new Customer();
			
			/*BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			StringBuffer name = new StringBuffer();*/

			
			/*do
			{
			System.out.println("enter name");
			name.append(input.readLine());
			System.out.println(name);
			}
			while(!service.validateName(name,input));*/
			
			String email;
			do
			{
			System.out.println("enter email id");
			email = sc.next();
			}while(!service.isValidEmailAddress(email));
			bean.setEmailId(email);
			
			System.out.println("enter address");
			String addr = sc.next();
			bean.setAddr(addr);
			
			String id;
			do
			{
			System.out.println("enter id proof number(5 digit id)");
			id = sc.next();
			}
			while(!service.validateId(id));
			bean.setId(id);
						
			String mobile;
			do
			{
			System.out.println("enter mobile number");
			mobile = sc.next();
			}
			while(!service.validateNumber(mobile) );
			bean.setMobileNo(mobile);
			
			int age;
			do
			{
			System.out.println("enter age");
			age = sc.nextInt();
			}
			while(!service.validateAge(age));
			bean.setAge(age);
			
			Random rnd = new Random();
			int accountNo = 100000 + rnd.nextInt(900000);
			System.out.println(accountNo);
			bean.setAccountNo(accountNo);
			
			Random rnd2 = new Random();
			int pin = 1000 + rnd.nextInt(9000);
			System.out.println(pin);
			bean.setPin(pin);
			
			double balance;
			do
			{
			System.out.println("enter initial balance");
			balance = sc.nextInt();
			}
			while(!service.validateBalance(balance));
			bean.setBalance(balance);
			
			System.out.println(bean);
			//handing objects to bean object after taking input from user
			long a = bean.getAccountNo();
			boolean isAdded = service.addCustomer(a, bean);
			break;
		
		
		case 2:
			System.out.println("enter account number and pin to show balance");
			
			
			System.out.println("enter account number");
			long accountNo2 = sc.nextLong();
			
			System.out.println("enter pin");
			int pin2 = sc.nextInt();
		
			Customer c = service.displayCustomer(accountNo2, pin2);
				
			break;
		
		
		case 3:
			 Customer c11 = new Customer();
			System.out.println("enter account number and amount to be deposited");
			
			System.out.println("enter account no");
			long accountNo3 = sc.nextLong();
			
			System.out.println("enter amount to be deposited");
			double depositAmount = sc.nextDouble();
			//c1.getSb();
		System.out.println("c1.getSb()" + c11.getSb());
			Customer ac = service.deposit(accountNo3, depositAmount, c11.getSb(),  c11);
			System.out.println("your balance is now: ");
			System.out.println(ac.getBalance());
			System.out.println("c1.getSb()" + c11.getSb());
			
			
			
			break;
			
			
		case 4:
			System.out.println("enter account number and pin to proceed");
			
			System.out.println("enter account number");
			long accountNo4 = sc.nextLong();

			System.out.println("enter pin");
			int pin4 = sc.nextInt();
			
			System.out.println("enter amount to be withdrawn");
			double withdrawAmount = sc.nextDouble();
			
			Customer c8 = service.withdraw(accountNo4 , pin4 , withdrawAmount, sb);
			System.out.println("your balance is now: ");
			System.out.println(c8.getBalance());
			
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
			//System.out.println("balance: " + c2.getBalance());
			
			break;
			
		case 6:
			System.out.println("enter account number and pin to print transactions");
			
			System.out.println("enter your account number");
			long accountNo6 = sc.nextLong();
			
			System.out.println("enter your pin");
			int pin6 = sc.nextInt();
		
			Customer c3 = service.printTransactions(accountNo6 , pin6);
			
			
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
