package assignment2_q2;

import assignment2_q2_men.Men;
import assignment2_q2_women.Women;



public class Appearals {
	
	static String[] subCategories = {"Men","Women"};
	
	
	public void showCategory()
	{
		
		/*Food fod = new Food();
		HouseHold hus = new HouseHold();
		int total = fod.getCount()+hus.getCount();
		System.out.println("Grocery ("+total+")");*/
		Men m = new Men();
		Women w = new Women();
		int total = m.getTotalItems_inMen() + w.getTotalItems_inWomen();
		
		System.out.println("APPEARALS");
		
	}
	
	
	
	
	public static void showFurtherCategories()
	{
		System.out.println("These are the following sub Categories in Appearals.");
		for(int i=0;i<subCategories.length;i++)
		{
			System.out.println(subCategories[i]);
		}
		System.out.println("If you want to go back to main page type 'main' or select 1 of the following sub Category");
	}
	

}
