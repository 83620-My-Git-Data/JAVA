package com.sunbeam;

import java.util.Scanner;

public class CreditTest {

	public static void main(String[] args) 
	{
		int choice;
		CreditCard cc = new CreditCard();
		cc.accept();
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println();
			System.out.println("------Enter your choice------");
			System.out.println("1. To Enter Purchase Amount buy through Credit Card");
			System.out.println("2. To Enter Amount Credit to Credit Card");
			System.out.println("3. Check Available limit");
			System.out.println("4. To Check Total credit debit transaction amount this month");
			System.out.println("0. To Exit");
			System.out.print("You Choose : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 0  : 
						System.out.println("Thanks For Using"); 
						break;
				case 1	:
						System.out.print("Enter Transaction Amount of Item Purchased using Credit card  : ");
						cc.checkCalculate(sc.nextDouble());
						break;
				case 2	:
						System.out.print("Enter Amount Paid to Credit Account : ");
						cc.setCredited(sc.nextDouble());
						break;
				case 3  :
						System.out.println("Available Credit : "+cc.availableCredit());
						break;
				case 4	:
						cc.display();
						break;
				default : 
						System.out.println("Invalid Choice. Please Retry");
						break;
			}
			
		}while(choice!=0);	
	}

}
