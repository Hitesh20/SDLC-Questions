package assignment2_q2;

import assignment2_q2.Grocery.Food;
import assignment2_q2.Grocery.HouseHold;

public class Grocery {
	
	
	static String[] subCategories = {"Food","HouseHold"};
	int totalCount=0;
	
	public void showCategory()
	{
		
		Food fod = new Food();
		HouseHold hus = new HouseHold();
		int total = fod.getCount()+hus.getCount();
		System.out.println("Grocery ("+total+")");
		
	}
	
	public static void showFurtherCategories()
	{
		
		System.out.println("These are the following sub Categories in Grocery.");
		for(int i=0;i<subCategories.length;i++)
		{
			System.out.println(subCategories[i]);
		}
		System.out.println("If you want to go back to main page type 'main' or select 1 of the following sub Category");
	}
	
	
	class Food
	{
		
		final String[] products={"food1","food2","food3","food4","food5","food6","food7","food8"};
		int count = products.length;
		
		int getCount()
		{
			return count;
		}
		
		void showProducts()
		{
			System.out.println("FOOD ("+count+")");
			System.out.println("Product list is shown below");
			for(int i=0;i<products.length;i++)
			{
				System.out.println(products[i]);
			}
			System.out.println("If you want to get to the main page type 'main' or type 'end' to terminate the program");
		}
		
		
	}
	class HouseHold
	{
		
		final String[] products={"hHold1","hHold2"};
		int count = products.length;
		
		int getCount()
		{
			return count;
		}
		
		void showProducts()
		{
			System.out.println("House Hold ("+count+")");
			System.out.println("Product list is shown below");
			for(int i=0;i<products.length;i++)
			{
				System.out.println(products[i]);
			}
			System.out.println("If you want to get to the main page type 'main' or type 'end' to terminate the program");
		}
		
	}



}
