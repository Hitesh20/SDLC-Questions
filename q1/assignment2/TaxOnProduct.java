package assignment2;

import java.util.HashMap;

public class TaxOnProduct {

	
	private static HashMap <String,String[]> product_category;
	private static HashMap <String,Double> product_gst;
	private static HashMap <String,Double> product_sgst;
	static String[] clothing_items = {"shirt","jeans","dress","shoes","tshirt"};
	static String[] luxury_items = {"earphones","guitar"};
	static String[] other_items = {"salt","sugar"};
	static
	{
		product_category = new HashMap<String,String[]>();
		product_gst = new HashMap<String,Double>();
		product_sgst = new HashMap<String,Double>();
		
		
		product_category.put("others",other_items);
		product_gst.put("others",(double) 5);
		product_sgst.put("others",(double) 5);
		
		
		product_category.put("clothing",clothing_items);
		product_gst.put("clothing",(double) 10);
		product_sgst.put("clothing",(double) 10);
		
		
		product_category.put("luxury",luxury_items);
		product_gst.put("luxury",(double) 15);
		product_sgst.put("luxury",(double) 15);
		
	}
	
	
	
	public static String findProductCategory(String item)
	{
		for(int i=0;i<other_items.length;i++)
		{
			if(item.equalsIgnoreCase(other_items[i]))
			{
				return "others";
			}
		}
		for(int i=0;i<clothing_items.length;i++)
		{
			if(item.equalsIgnoreCase(clothing_items[i]))
			{
				return "clothing";
			}
		}
		for(int i=0;i<luxury_items.length;i++)
		{
			if(item.equalsIgnoreCase(luxury_items[i]))
			{
				return "luxury";
			}
		}
		
		return "Sorry";
		
	}
	
	
	
	public static double billing_OthersGST(double amt)
	{
		double value = (product_gst.get("others")/100)*amt;
		
		return value;
	}
	public static double billing_ClothingGST(double amt)
	{
		double value = (product_gst.get("clothing")/100)*amt;
		
		return value;
	}
	public static double billing_LuxuryGST(double amt)
	{
		double value = (product_gst.get("luxury")/100)*amt;
		
		return value;
	}
	
	
	
	public static double billing_OthersSGST(double amt)
	{
		double value = (product_sgst.get("others")/100)*amt;
		
		return value;
	}
	public static double billing_ClothingSGST(double amt)
	{
		double value = (product_sgst.get("clothing")/100)*amt;
		
		return value;
	}
	public static double billing_LuxurySGST(double amt)
	{
		double value = (product_sgst.get("luxury")/100)*amt;
		
		return value;
	}
	
	
}
