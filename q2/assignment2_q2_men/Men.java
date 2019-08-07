package assignment2_q2_men;

import assignment2_q2_men.MenMore.Shirt;

public class Men extends MenMore
{
	
	String menCategories[] = {"Clothing","Accessories"};
	
	public int getTotalItems_inMen()
	{
		Clothing cl = new Clothing();
		int total = cl.getCount();	
		return total;
	}
	
	
	public void showMenCategories()
	{
		System.out.println("These are the following sub Categories in Men.");
		for(int i=0;i<menCategories.length;i++)
		{
			System.out.println(menCategories[i]);
		}
		System.out.println("If you want to go back to main page type 'main' or select 1 of the following sub Category in MEN or type end to terminate");
				
	}
	
	public class Clothing
	{
		String diffProducts[] = {"shirts","jeans"};
		Shirt s = new Shirt();
		Jeans j = new Jeans();
		public boolean shirtcheck = false;
		public boolean jeanscheck = false;
		//Jeans j = new Jeans();
		
		public void setObject(String str)
		{
			if(str.equalsIgnoreCase("shirt"))
			{
				shirtcheck = true;
				jeanscheck = false;
			}
			else if(str.equalsIgnoreCase("jeans"))
			{
				shirtcheck = false;
				jeanscheck = true;
				
			}
			
			
		}
		
		
		
		public int getCount()
		{
			int total=0;
			Shirt sh = new Shirt();
			//Jeans js = new Jeans();
			total += sh.getTotalShirts();
			
			return total;
		}
		
		public void showProducts()
		{
			System.out.println("Which product you want to BUY. Type Any... or type main to get to the main category");
			for(int i=0;i<diffProducts.length;i++)
			{
				System.out.println(diffProducts[i]);
			}	
		}
		
		public void see()
		{
			if(shirtcheck)
			{
				s.addProducts();	
				s.seeProducts();
			}
			else if(jeanscheck)
			{
				
				j.addProducts();
				j.seeProducts();
				
				
			}
		}

		public void searchSize(String size)
		{
			if(shirtcheck)
			{
				s.findSize(size);
			}
			else if(jeanscheck)
			{
				j.findSize(size);
			}
			
		}
		public void searchColor(String color)
		{
			if(shirtcheck)
			{
				s.findColor(color);
			}
			else if(jeanscheck)
			{
				j.findColor(color);
			}
		}

		public void searchBoth(String size, String color)
		{
			if(shirtcheck)
			{
				s.findBoth(size,color);
			}
			else if(jeanscheck)
			{
				j.findBoth(size,color);
			}
			
			
		}
		
		public void removeList()
		{
			if(shirtcheck)
			{
				s.deletingList();
			}
			else if(jeanscheck)
			{
				j.deletingList();
			}
		}

		
	}
	
	public class Accessories
	{
		String diffProducts[] = {"perfumes","watches"};
		Perfume p = new Perfume();
		Watch w = new Watch();
		public boolean perfumeCheck = false;
		public boolean watchCheck = false;
		//Jeans j = new Jeans();
		
		public void setObject(String str)
		{
			if(str.equalsIgnoreCase("perfume"))
			{
				perfumeCheck = true;
				watchCheck = false;
			}
			else if(str.equalsIgnoreCase("watch"))
			{
				perfumeCheck = false;
				watchCheck = true;
				
			}
			
			
		}
		
		
		
		public int getCount()
		{
			int total=0;
			Perfume per = new Perfume();
			//Jeans js = new Jeans();
			total += per.getTotalShirts();
			
			return total;
		}
		
		public void showProducts()
		{
			System.out.println("Which product you want to BUY. Type Any... or type main to get to the main category");
			for(int i=0;i<diffProducts.length;i++)
			{
				System.out.println(diffProducts[i]);
			}	
		}
		
		public void see()
		{
			if(perfumeCheck)
			{
				p.addProducts();	
				p.seeProducts();
			}
			else if(watchCheck)
			{
				
				w.addProducts();
				w.seeProducts();
				
				
			}
		}

		public void searchSize(String size)
		{
			if(perfumeCheck)
			{
				p.findSize(size);
			}
			else if(watchCheck)
			{
				w.findSize(size);
			}
			
		}
		public void searchColor(String color)
		{
			if(perfumeCheck)
			{
				p.findColor(color);
			}
			else if(watchCheck)
			{
				w.findColor(color);
			}
		}

		public void searchBoth(String size, String color)
		{
			if(perfumeCheck)
			{
				p.findBoth(size,color);
			}
			else if(watchCheck)
			{
				w.findBoth(size,color);
			}
			
			
		}
		
		public void removeList()
		{
			if(perfumeCheck)
			{
				p.deletingList();
			}
			else if(watchCheck)
			{
				w.deletingList();
			}
		}

		
	}
	


	
	
	

}
