package assignment2_q2;

public class Electronics
{
	static String[] subCategories = {"Laptop","Mobile"};
	int totalCount=0;
	
	public void showCategory()
	{
		
		Laptop lap = new Laptop();
		Mobile mob = new Mobile();
		int total = lap.getCount()+mob.getCount();
		System.out.println("Electronics ("+total+")");
		
	}
	
	public static void showFurtherCategories()
	{
		
		System.out.println("These are the following sub Categories in Electronics.");
		for(int i=0;i<subCategories.length;i++)
		{
			System.out.println(subCategories[i]);
		}
		System.out.println("If you want to go back to main page type 'main' or select 1 of the following sub Category");
	}
	
	
	class Laptop
	{
		
		final String[] products={"laptop1","laptop2","laptop3","laptop4","laptop5"};
		int count = products.length;
		
		int getCount()
		{
			return count;
		}
		
		void showProducts()
		{
			System.out.println("LAPTOP ("+count+")");
			System.out.println("Product list is shown below");
			for(int i=0;i<products.length;i++)
			{
				System.out.println(products[i]);
			}
			System.out.println("If you want to get to the main page type 'main' or type 'end' to terminate the program");
		}
		
		
	}
	class Mobile
	{
		
		final String[] products={"mobile1","mobile2","mobile3","mobile4","mobile5"};
		int count = products.length;
		
		int getCount()
		{
			return count;
		}
		
		void showProducts()
		{
			System.out.println("MOBILE ("+count+")");
			System.out.println("Product list is shown below");
			for(int i=0;i<products.length;i++)
			{
				System.out.println(products[i]);
			}
			System.out.println("If you want to get to the main page type 'main' or type 'end' to terminate the program");
		}
		
	}


}
