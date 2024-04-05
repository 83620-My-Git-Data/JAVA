package com.sunbeam;

import java.util.Scanner;

public class CreditCard 
{
	private double creditlimit;
	private double charged;
	private double initialpending;
	private double credited;
	
	public CreditCard()
	{
		creditlimit=0;
		charged=0;
		initialpending=0;
		credited=0;
	}
	public CreditCard(double creditlimit,double charged,double initialpending,double credited)
	{
		this.creditlimit=creditlimit;
		this.charged=charged;
		this.initialpending=initialpending;
		this.credited=credited;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Credit limit : ");
		creditlimit = sc.nextDouble();
		System.out.print("Enter Initial pending amount : ");
		initialpending = sc.nextDouble();
		
	}
	
	public void display()
	{
		System.out.println();
		System.out.println("Total Credit Limit : "+creditlimit);
		System.out.println("Available limit : "+availableCredit());
		System.out.println("Used Limit : "+(creditlimit-availableCredit()));
		System.out.println("Total Amount Spend this month : "+charged);
		System.out.println("Total Amount Credited towards credit card this month : "+credited);
	}
	
	public void checkCalculate(double amount)
	{
		if(amount > 0)
		{
			if(amount < availableCredit())
			{
				initialpending = initialpending+amount;
				charged = charged + amount;
			}
			else
			{
				System.out.println();
				System.out.println("Transaction cancelled as transaction exceeds your credit limit");
			}
			
		}
		else
		{
			System.out.println();
			System.out.println("Amount cannot be zero or negative");
		}
	}
	
	public double availableCredit()
	{
		return creditlimit-initialpending;
	}
	
	public void setCredited(double credit)
	{
		if(credit > 0)
		{
			if(creditlimit >= (availableCredit()+credit))
			{
			System.out.println();
			initialpending = initialpending-credit;
			System.out.println("Amount credited");
			System.out.println("Available Credit : "+availableCredit());
			credited = credited + credit;
			}
			else 
			{
				System.out.println();
				System.out.println("Transaction cancelled as you cannot paid more amount than used credit limit");
			}
		}
		else 
		{
			System.out.println();
			System.out.println("Amount cannot be zero or negative");
		}
	}

}
