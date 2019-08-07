package assignment2_q2_women;
import java.util.*;

import assignment2_q2.Filter_Problem;
import assignment2_q2_men.MenMore.Perfume;
import assignment2_q2_men.MenMore.Watch;
public class WomenMore
{
	
	
	
	public class Shirt
	{
		String item_name[] = {"wshirt1","wshirt2","wshirt3","wshirt4","wshirt5","wshirt6"};
		String item_id[] = {"T1","T2","T3","T4","T5","T6"};
		String item_size[] = {"S","M","S","XL","L","M"};
		String item_color[] = {"black","white","black","grey","white","grey"};
		
		String name;
		String p_id;
		String size;
		String color;
		
		
		ArrayList<Shirt> item_details = new ArrayList<Shirt>();
		
		
		public int getTotalShirts()
		{
			return item_name.length;
		}
		
		
		public void addProducts()
		{
			
			for(int i=0;i<item_name.length;i++)
			{
				Shirt s = new Shirt();
				s.name = item_name[i];
				s.p_id = item_id[i];
				s.size = item_size[i];
				s.color = item_color[i];
				item_details.add(s);
			}
			
		}
		
		
		public void seeProducts()
		{
			for(Shirt sh:item_details)
			{
				System.out.println(sh);
			}
			System.out.println("You can apply filters over it too. You can search for different sizes ('S','M','L','XL') "
					+ "or you can search for color (black/grey/white) because ony these many colors are present or you can apply both "
					+ "at once.");
			
		}
		
		public void findSize(String size)
		{
			//System.out.println("In find Size method");
			for(Shirt sh:item_details)
			{
				if((sh.size).equalsIgnoreCase(size))
				{
					System.out.println(sh);
				}	
			}
			System.out.println("You can change filters now ");
			//item_details.clear();
			Filter_Problem fp = new Filter_Problem();
			fp.applyFilter();
		}
		
		
		public void findColor(String color)
		{
			for(Shirt sh:item_details)
			{
				if(sh.color.equalsIgnoreCase(color))
				{
					System.out.println(sh);
				}
			}
			System.out.println("You can change filters");
			Filter_Problem fp = new Filter_Problem();
			//item_details.clear();
			fp.applyFilter();
		}
		
		
		public void findBoth(String size, String color)
		{
			for(Shirt sh:item_details)
			{
				if(sh.color.equalsIgnoreCase(color) && sh.size.equalsIgnoreCase(size))
				{
					System.out.println(sh);
				}
			}
			System.out.println("You can change filters");
			Filter_Problem fp = new Filter_Problem();
			//item_details.clear();
			fp.applyFilter();
		}
		
		
		public void deletingList()
		{
			item_details.clear();
		}
		
		public String toString()
		{
			return name + " " + color + " " + size;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	public class Jeans
	{
		String item_name[] = {"jean1","jean2","jean3","jean4","jean5","jean6","jean7","jean8"};
		String item_id[] = {"J1","J2","J3","J4","J5","J6","J7","J8"};
		String item_size[] = {"S","M","S","XL","L","M","L","XL"};
		String item_color[] = {"black","white","black","grey","white","grey","white","black"};
		
		String name;
		String p_id;
		String size;
		String color;
		
		
		ArrayList<Jeans> item_details = new ArrayList<Jeans>();
		
		
		public int getTotalJeans()
		{
			return item_name.length;
		}
		
		
		public void addProducts()
		{
			
			for(int i=0;i<item_name.length;i++)
			{
				Jeans j = new Jeans();
				j.name = item_name[i];
				j.p_id = item_id[i];
				j.size = item_size[i];
				j.color = item_color[i];
				item_details.add(j);
			}
			
		}
		
		
		public void seeProducts()
		{
			//System.out.println("getting jeans");
			for(Jeans jj:item_details)
			{
				System.out.println(jj);
			}
			System.out.println("You can apply filters over it too. You can search for different sizes ('S','M','L','XL') "
					+ "or you can search for color (black/grey/white) because ony these many colors are present or you can apply both "
					+ "at once.");
			
		}
		
		public void findSize(String size)
		{
			//System.out.println("In find Size method");
			for(Jeans jj:item_details)
			{
				if((jj.size).equalsIgnoreCase(size))
				{
					System.out.println(jj);
				}	
			}
			System.out.println("You can change filters now ");
			//item_details.clear();
			Filter_Problem fp = new Filter_Problem();
			fp.applyFilter();
		}
		
		
		public void findColor(String color)
		{
			for(Jeans jj:item_details)
			{
				if(jj.color.equalsIgnoreCase(color))
				{
					System.out.println(jj);
				}
			}
			System.out.println("You can change filters");
			Filter_Problem fp = new Filter_Problem();
			//item_details.clear();
			fp.applyFilter();
		}
		
		
		public void findBoth(String size, String color)
		{
			for(Jeans jj:item_details)
			{
				if(jj.color.equalsIgnoreCase(color) && jj.size.equalsIgnoreCase(size))
				{
					System.out.println(jj);
				}
			}
			System.out.println("You can change filters");
			Filter_Problem fp = new Filter_Problem();
			//item_details.clear();
			fp.applyFilter();
		}
		
		
		public void deletingList()
		{
			item_details.clear();
		}
		
		public String toString()
		{
			return name + " " + color + " " + size;
		}
		
	}
	
	
	public class Perfume
	{
		String item_name[] = {"perfume1","perfume2","perfume3","perfume4","perfume5","perfume6"};
		String item_id[] = {"P01","P02","P03","P04","P05","P06"};
		String item_size[] = {"S","M","L","XL","M","S"};
		String item_color[] = {"black","white","black","grey","black","white"};
		
		String name;
		String p_id;
		String size;
		String color;
		
		
		ArrayList<Perfume> item_details = new ArrayList<Perfume>();
		
		
		public int getTotalShirts()
		{
			return item_name.length;
		}
		
		
		public void addProducts()
		{
			
			for(int i=0;i<item_name.length;i++)
			{
				Perfume p = new Perfume();
				p.name = item_name[i];
				p.p_id = item_id[i];
				p.size = item_size[i];
				p.color = item_color[i];
				item_details.add(p);
			}
			
		}
		
		
		public void seeProducts()
		{
			for(Perfume pr:item_details)
			{
				System.out.println(pr);
			}
			System.out.println("You can apply filters over it too. You can search for different sizes ('S','M','L','XL') "
					+ "or you can search for color (black/grey/white) because ony these many colors are present or you can apply both "
					+ "at once.");
			
		}
		
		public void findSize(String size)
		{
			//System.out.println("In find Size method");
			for(Perfume pr:item_details)
			{
				if((pr.size).equalsIgnoreCase(size))
				{
					System.out.println(pr);
				}	
			}
			System.out.println("You can change filters now ");
			//item_details.clear();
			Filter_Problem fp = new Filter_Problem();
			fp.applyFilter();
		}
		
		
		public void findColor(String color)
		{
			for(Perfume pr:item_details)
			{
				if(pr.color.equalsIgnoreCase(color))
				{
					System.out.println(pr);
				}
			}
			System.out.println("You can change filters");
			Filter_Problem fp = new Filter_Problem();
			//item_details.clear();
			fp.applyFilter();
		}
		
		
		public void findBoth(String size, String color)
		{
			for(Perfume pr:item_details)
			{
				if(pr.color.equalsIgnoreCase(color) && pr.size.equalsIgnoreCase(size))
				{
					System.out.println(pr);
				}
			}
			System.out.println("You can change filters");
			Filter_Problem fp = new Filter_Problem();
			//item_details.clear();
			fp.applyFilter();
		}
		
		
		public void deletingList()
		{
			item_details.clear();
		}
		
		public String toString()
		{
			return name + " " + color + " " + size;
		}
		
	}
		
		
		public class Watch
		{
			String item_name[] = {"watch1","watch2","watch3","watch4","watch5","watch6","watch7","watch8","watch9","watch10"};
			String item_id[] = {"W01","W02","W03","W04","W05","W06","W07","W08","W09","W10"};
			String item_size[] = {"S","M","L","XL","M","L","M","XL","S","M"};
			String item_color[] = {"black","white","black","grey","white","black","black","grey","white","black"};
			
			String name;
			String p_id;
			String size;
			String color;
			
			
			ArrayList<Watch> item_details = new ArrayList<Watch>();
			
			
			public int getTotalShirts()
			{
				return item_name.length;
			}
			
			
			public void addProducts()
			{
				
				for(int i=0;i<item_name.length;i++)
				{
					Watch w = new Watch();
					w.name = item_name[i];
					w.p_id = item_id[i];
					w.size = item_size[i];
					w.color = item_color[i];
					item_details.add(w);
				}
				
			}
			
			
			public void seeProducts()
			{
				for(Watch pr:item_details)
				{
					System.out.println(pr);
				}
				System.out.println("You can apply filters over it too. You can search for different sizes ('S','M','L','XL') "
						+ "or you can search for color (black/grey/white) because ony these many colors are present or you can apply both "
						+ "at once.");
				
			}
			
			public void findSize(String size)
			{
				//System.out.println("In find Size method");
				for(Watch pr:item_details)
				{
					if((pr.size).equalsIgnoreCase(size))
					{
						System.out.println(pr);
					}	
				}
				System.out.println("You can change filters now ");
				//item_details.clear();
				Filter_Problem fp = new Filter_Problem();
				fp.applyFilter();
			}
			
			
			public void findColor(String color)
			{
				for(Watch pr:item_details)
				{
					if(pr.color.equalsIgnoreCase(color))
					{
						System.out.println(pr);
					}
				}
				System.out.println("You can change filters");
				Filter_Problem fp = new Filter_Problem();
				//item_details.clear();
				fp.applyFilter();
			}
			
			
			public void findBoth(String size, String color)
			{
				for(Watch pr:item_details)
				{
					if(pr.color.equalsIgnoreCase(color) && pr.size.equalsIgnoreCase(size))
					{
						System.out.println(pr);
					}
				}
				System.out.println("You can change filters");
				Filter_Problem fp = new Filter_Problem();
				//item_details.clear();
				fp.applyFilter();
			}
			
			
			public void deletingList()
			{
				item_details.clear();
			}
			
			public String toString()
			{
				return name + " " + color + " " + size;
			}
		
	}
	
	

}
