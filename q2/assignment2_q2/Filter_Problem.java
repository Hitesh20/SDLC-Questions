package assignment2_q2;
import java.util.*;

import assignment2_q2_men.*;
import assignment2_q2_men.Men.Clothing;
import assignment2_q2_women.*;
public class Filter_Problem
{

	static Scanner sc;
	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		Map <String, ArrayList<String>> mainCategory;
		ArrayList<String> sub_category1 = new ArrayList<String>();
		sub_category1.add("Electronics");
		sub_category1.add("Grocery");
		sub_category1.add("Appearals");
		mainCategory = new HashMap<String, ArrayList<String>>();
		mainCategory.put("Category",sub_category1);
		search();
		

	}
	static Men m = new Men();
	static Men.Clothing cloth = m.new Clothing();
	static Men.Accessories acs = m.new Accessories();
	
	
	static Women w = new Women();
	static Women.Clothing wcloth = w.new Clothing();
	static Women.Accessories wacs = w.new Accessories();
	
	
	
	
	
	public static boolean menCategory = false;
	public static boolean womenCategory = false;
	
	
	public static boolean clothingCheck = false;
	public static boolean accessoriesCheck = false;
	
	
	public static void search()
	{
		System.out.println("In which category you want to search");
		System.out.println("1) Electronics");
		System.out.println("2) Grocery");
		System.out.println("3) Appearals");
		String str = sc.next();
		if(str.equalsIgnoreCase("Electronics"))
		{
			Electronics e = new Electronics();
			e.showCategory();
			Electronics.showFurtherCategories();
			String option = sc.next();
			if(option.equalsIgnoreCase("main"))
			{
				search();
			}
			else if(option.equalsIgnoreCase("laptop"))
			{
				Electronics.Laptop laptop = e.new Laptop();
				laptop.showProducts();
				String a = sc.next();
				if(a.equalsIgnoreCase("main"))
				{
					search();
				}
				else if(a.equalsIgnoreCase("end"))
				{
					System.out.println("Thanks for viewing");
				}
				else
				{
					System.out.println("Did not get you... You are directed back to main page.");
					search();
				}
			}
			else if(option.equalsIgnoreCase("mobile"))
			{
				Electronics.Mobile mobile = e.new Mobile();
				mobile.showProducts();
				String a = sc.next();
				if(a.equalsIgnoreCase("main"))
				{
					search();
				}
				else if(a.equalsIgnoreCase("end"))
				{
					System.out.println("Thanks for viewing");
				}
				else
				{
					System.out.println("Did not get you... You are directed back to main page.");
					search();
				}
				
			}
			
			}
			else if(str.equalsIgnoreCase("Grocery"))
			{
				//System.out.println("hello");
				Grocery g = new Grocery();
				g.showCategory();
				Grocery.showFurtherCategories();
				String option = sc.next();
				if(option.equalsIgnoreCase("main"))
				{
					search();
				}
				else if(option.equalsIgnoreCase("food"))
				{
					Grocery.Food food = g.new Food();
					food.showProducts();
					String a = sc.next();
					if(a.equalsIgnoreCase("main"))
					{
						search();
					}
					else if(a.equalsIgnoreCase("end"))
					{
						System.out.println("Thanks for viewing");
					}
					else
					{
						System.out.println("Did not get you... You are directed back to main page.");
						search();
					}
				}
				else if(option.equalsIgnoreCase("household"))
				{
					Grocery.HouseHold hld = g.new HouseHold();
					hld.showProducts();
					String a = sc.next();
					if(a.equalsIgnoreCase("main"))
					{
						search();
					}
					else if(a.equalsIgnoreCase("end"))
					{
						System.out.println("Thanks for viewing");
					}
					else
					{
						System.out.println("Did not get you... You are directed back to main page.");
						search();
					}
				}
					
			}
			else if(str.equalsIgnoreCase("Appearals"))
			{
				Appearals ap = new Appearals();
				ap.showCategory();
				Appearals.showFurtherCategories();
				String option = sc.next();
				if(option.equalsIgnoreCase("main"))
				{
					search();
				}
				else if(option.equalsIgnoreCase("men"))
				{
					//Men m = new Men();
					menCategory = true;
					womenCategory = false;
					m.showMenCategories();
					String a = sc.next();
					if(a.equalsIgnoreCase("main"))
					{
						search();
					}
					else if(a.equalsIgnoreCase("end"))
					{
						System.out.println("Thanks for viewing");
					}
					else if(a.equalsIgnoreCase("Clothing"))
					{
						//Men.Clothing cloth = m.new Clothing();
						clothingCheck = true;
						accessoriesCheck = false;
						cloth.showProducts();
						String searchProduct = sc.next();
						if(searchProduct.equalsIgnoreCase("main"))
						{				
							search();
							
						}
						else if(searchProduct.equalsIgnoreCase("shirts") || searchProduct.equalsIgnoreCase("shirt"))
						{
							
							cloth.setObject("shirt");
							
							cloth.see();
							applyFilter();
								
						}
						else if(searchProduct.equalsIgnoreCase("jeans") || searchProduct.equalsIgnoreCase("jean"))
						{
							
							cloth.setObject("jeans");
							
							cloth.see();
							applyFilter();
								
						}
						else
						{
							System.out.println("Did not quite get you");
						}
						
						
					}
					else if(a.equalsIgnoreCase("Accessories"))
					{
						clothingCheck = false;
						accessoriesCheck = true;
						acs.showProducts();
						String searchProduct = sc.next();
						if(searchProduct.equalsIgnoreCase("main"))
						{				
							search();
						}
						else if(searchProduct.equalsIgnoreCase("perfume") || searchProduct.equalsIgnoreCase("perfumes"))
						{
							
							acs.setObject("perfume");
							acs.see();
							applyFilter();
								
						}
						else if(searchProduct.equalsIgnoreCase("watch") || searchProduct.equalsIgnoreCase("watches"))
						{
							
							acs.setObject("jeans");
							clothingCheck = false;
							accessoriesCheck = true;
							acs.see();
							applyFilter();
								
						}
						else
						{
							System.out.println("Did not quite get you");
						}
						
					}
					else
					{
						System.out.println("Did not get you... You are directed back to main page.");
						search();
					}
				}
				else if(option.equalsIgnoreCase("women"))
				{
					menCategory = false;
					womenCategory = true;
					w.showWomenCategories();
					String a = sc.next();
					if(a.equalsIgnoreCase("main"))
					{
						search();
					}
					else if(a.equalsIgnoreCase("end"))
					{
						System.out.println("Thanks for viewing");
					}
					else if(a.equalsIgnoreCase("Clothing"))
					{
						clothingCheck = true;
						accessoriesCheck = false;
						wcloth.showProducts();
						String searchProduct = sc.next();
						if(searchProduct.equalsIgnoreCase("main"))
						{				
							search();
						}
						else if(searchProduct.equalsIgnoreCase("shirts") || searchProduct.equalsIgnoreCase("shirt"))
						{
							
							wcloth.setObject("shirt");
							wcloth.see();
							applyFilter();
								
						}
						else if(searchProduct.equalsIgnoreCase("jeans") || searchProduct.equalsIgnoreCase("jean"))
						{
							
							wcloth.setObject("jeans");
							wcloth.see();
							applyFilter();
								
						}
						else
						{
							System.out.println("Did not quite get you");
						}
						
						
					}
					else if(a.equalsIgnoreCase("Accessories"))
					{
						clothingCheck = false;
						accessoriesCheck = true;
						wacs.showProducts();
						String searchProduct = sc.next();
						if(searchProduct.equalsIgnoreCase("main"))
						{				
							search();
						}
						else if(searchProduct.equalsIgnoreCase("perfume") || searchProduct.equalsIgnoreCase("perfumes"))
						{
							
							wacs.setObject("perfume");
							wacs.see();
							applyFilter();
								
						}
						else if(searchProduct.equalsIgnoreCase("watch") || searchProduct.equalsIgnoreCase("watches"))
						{
							
							wacs.setObject("jeans");
							wacs.see();
							applyFilter();
								
						}
						else
						{
							System.out.println("Did not quite get you");
						}
						
					}
					else
					{
						System.out.println("Did not get you... You are directed back to main page.");
						search();
					}
						
						
					}
					else
					{
						System.out.println("Did not get you... You are directed back to main page.");
						search();
					}
					
					
					
					
				}
				
				
				    
			else
			{
				System.out.println("Unable to process your request.");
				search();
			}	
				
			}
	
	static public void applyFilter()
	{
		System.out.println("Do you want to apply any filter. Reply with either yes or no");
		String wantFilter = sc.next();
		if(wantFilter.equalsIgnoreCase("yes"))
		{
			System.out.println("Want to apply filter on size or color or both");
			String filter = sc.next();
			if(filter.equalsIgnoreCase("size"))
			{
				System.out.println("Set Size (S/M/L/XL)");
				String size_filter = sc.next();
				if(menCategory)
				{
					if(clothingCheck)
					{
						cloth.searchSize(size_filter);
					}
					else if(accessoriesCheck)
					{
						acs.searchSize(size_filter);
					}
				}
				else if(womenCategory)
				{
					if(clothingCheck)
					{
						wcloth.searchSize(size_filter);
					}
					else if(accessoriesCheck)
					{
						wacs.searchSize(size_filter);
					}
					
				}
				
			}
			else if(filter.equalsIgnoreCase("color"))
			{
				System.out.println("Set Color (black/grey/white)");
				String color_filter = sc.next();
				//Men m = new Men();
				//Men.Clothing cloth = m.new Clothing();
				if(menCategory)
				{
					if(clothingCheck)
					{
						cloth.searchColor(color_filter);
					}
					else if(accessoriesCheck)
					{
						acs.searchColor(color_filter);
					}
					
					
				}
				else if(womenCategory)
				{
					if(clothingCheck)
					{
						wcloth.searchColor(color_filter);
					}
					else if(accessoriesCheck)
					{
						System.out.println("in women color filter");
						wacs.searchColor(color_filter);
					}
					
				}
				
				
			}
			else if(filter.equalsIgnoreCase("both"))
			{
				System.out.println("Set Size (S/M/L/XL)");
				String size_filter = sc.next();
				System.out.println("Set Color (black/grey/white)");
				String color_filter = sc.next();
				//Men m = new Men();
				//Men.Clothing cloth = m.new Clothing();
				if(menCategory)
				{
					if(clothingCheck)
					{
						cloth.searchBoth(size_filter,color_filter);
					}
					else if(accessoriesCheck)
					{
						acs.searchBoth(size_filter,color_filter);
					}
					
					
				}
				else if(womenCategory)
				{
					if(clothingCheck)
					{
						wcloth.searchBoth(size_filter,color_filter);
					}
					else if(accessoriesCheck)
					{
						wacs.searchBoth(size_filter,color_filter);
					}
					
				}
			}
			else
			{
				System.out.println("Did not get you");
				search();
			}
			
		}
		else
		{
			if(menCategory)
			{
				if(clothingCheck)
				{
					cloth.removeList();
				}
				else if(accessoriesCheck)
				{
					acs.removeList();
				}
				
			}
			else if(womenCategory)
			{
				if(clothingCheck)
				{
					wcloth.removeList();
				}
				else if(accessoriesCheck)
				{
					wacs.removeList();
				}
			}
			
			search();
		}
	
		
	}
			

	
		
}