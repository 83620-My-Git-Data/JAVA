package com.app.fruits.tester;

import java.util.Scanner;

import com.app.fruits.*;

public class FruitBasket {

	public static void main(String[] args) 
	{
		int basket_size;
		int choice;
		int counter = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Basket Size : ");
		basket_size = sc.nextInt();
		Fruit []basket = new Fruit[basket_size];
		
		do
		{
			System.out.println();
			System.out.println("Please Choose option");
			System.out.println("0. To Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display Name of all Fruits in Basket");
			System.out.println("5. Display Details of all Fresh Fruits in Basket");
			System.out.println("6. Diplay all Stale fruit in Basket");
			System.out.println("7. Mark Fruit as Stale");
			System.out.println("8. To Mark all sour fruit as Stale");
			System.out.print("You Choose : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 0: 
				{
					System.out.println();
					System.out.println("Thanks For Using"); 
					break;
				}
				case 1:
				{
					if(counter < basket_size)
					{
						System.out.println();
						System.out.print("Enter Weight : ");
						basket[counter] = new Mango(sc.nextDouble());
						counter++;
					}
					else
					{
						System.out.println();
						System.out.println("Basket is Full");
					}
					break;
				}
				case 2:
				{
					if(counter < basket_size)
					{
						System.out.println();
						System.out.print("Enter Weight : ");
						basket[counter] = new Orange(sc.nextDouble());
						counter++;
					}
					else
					{
						System.out.println();
						System.out.println("Basket is Full");
					}
					break;
				}
				case 3:
				{
					if(counter < basket_size)
					{
						System.out.println();
						System.out.print("Enter Weight : ");
						basket[counter] = new Apple(sc.nextDouble());
						counter++;
					}
					else
					{
						System.out.println();
						System.out.println("Basket is Full");
					}
					break;
				}
				case 4:
				{
					System.out.println();
					if(basket.length != 0)
					{
						for (Fruit fruit : basket) 
							{
								System.out.println(fruit.getName());
							}
					}
					else
					{
						System.out.println("Basket is Empty");
					}
					break;
				}
				case 5:
				{
					int freshcount=0;
					System.out.println();
					if(basket.length != 0)
					{
						for(int i=0; i<basket.length; i++) 
							{
								if(basket[i] instanceof Mango && basket[i].isFresh() == true)
								{
								Mango mg = (Mango) basket[i];
								System.out.println(basket[i].toString()+" Taste="+mg.taste()+" isFresh="+basket[i].isFresh()+" ]");
								freshcount++;
								}
								if(basket[i] instanceof Apple && basket[i].isFresh() == true)
								{
								Apple ap = (Apple) basket[i];
								System.out.println(basket[i].toString()+" Taste="+ap.taste()+" isFresh="+basket[i].isFresh()+" ]");
								freshcount++;
								}
								if(basket[i] instanceof Orange && basket[i].isFresh() == true)
								{
								Orange or = (Orange) basket[i];
								System.out.println(basket[i].toString()+" Taste="+or.taste()+" isFresh="+basket[i].isFresh()+" ]");
								freshcount++;
								}
							}
						if(freshcount==0)
							System.out.println("No Fresh Fruit in Basket");
					}
					else
					{
						System.out.println("Basket is Empty");
					}
					break;
				}
				case 6:
				{
					int stalecount=0;
					System.out.println();
					if(basket.length !=0)
					{
						for (Fruit fruit : basket) 
						{
							if(fruit.isFresh() == false)
							{
								System.out.println(fruit.toString()+" ]");
								stalecount++;
							}
						}
						if(stalecount == 0)
						{
							System.out.println("No Stalled Food");
						}
					}
					else 
					{
						System.out.println("Basket is Empty");
					}
					break;
				}
				case 7:
				{
					System.out.println();
					int in;
					if(basket.length !=0)
					{
						System.out.print("Please Enter index of Stale food : ");
						in = sc.nextInt();
						if(in < basket.length && in >=0)
						{
							if(basket[in].isFresh()==true)
							{
							basket[in].setIsFreshStatusAsStale();
							System.out.println("Set fruit as Stalled on that index");
							}
							else
								System.out.println("Already Stalled fruit at that index");
						}
						else 
						{
							System.out.println("Invalid index");
						}
					}
					else 
					{
						System.out.println("Basket is Empty");
					}
					break;
				}
				case 8:
				{
					System.out.println();
					if(basket.length !=0)
					{
						for(int i=0; i<basket.length ;i++)
						{
							if(basket[i] instanceof Orange)
							{
								
								if("sour".equals(basket[i].taste()) && basket[i].isFresh()==true)
									{
										basket[i].setIsFreshStatusAsStale();
										System.out.println("Set Sour fruit as Stale");
									}
								else 
									System.out.println("No fresh sour fruit in basket already stalled");
							}
							else
								System.out.println("No sour fruit in basket");
						}
					}
					else
					{
						System.out.println("Basket is empty");
					}
					break;
				}
				default: 
				{
					System.out.println();
					System.out.println("Invalid choice. Please rechoose"); 
					break;
				}
			}
				
		}while(choice!=0);
		
		sc.close();
	}
}
