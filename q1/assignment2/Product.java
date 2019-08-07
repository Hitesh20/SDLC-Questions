package assignment2;



public class Product extends TaxOnProduct {
	String p_name;
	double p_price;
	double actualPrice;
	int quantity;
	String category;
	static double total=0;
	static double gst_others=0;
	static double gst_clothing=0;
	static double gst_luxury=0;
	static double sgst_others=0;
	static double sgst_clothing=0;
	static double sgst_luxury=0;
	
	
	static String returnOthers = "within One Day";
	static String returnClothing = "within 30 days with tag intact";
	static String returnLuxury = "non-refundable";
	
	
	
	final static String products[] = {"shirt","jeans","dress","shoes","tshirt","earphones","guitar","salt","sugar"};
	final static double price[]= {1500,3000,4000,5000,800,1000,8000,150,230};
	
	
	public static void show_items()
	{
		for(int i=0;i<products.length;i++)
		{
			System.out.println(i+1+")"+products[i]+"-"+price[i]);
		}
		System.out.println("Enter item you want to buy as well as quantity");
		
		
	}
	
	public static Product add_items(String item, int qty)
	{
		Product p = new Product();
		for(int i=0;i<products.length;i++)
		{
			if(item.equalsIgnoreCase(products[i]))
			{
				p.category = findProductCategory(item);
				p.p_name = item;
				p.actualPrice = price[i];
				p.p_price = p.actualPrice*qty;
				p.quantity = qty;
				total+=(p.p_price);
				break;
			}
			
		}
		return p;
	}
	
	
	public Product removeItem(Product pr)
	{
		if(pr.quantity==0)
		{
			return pr;
		}
		else if(pr.quantity>0)
		{
			total-=pr.p_price;
			pr.p_price = 0; 
			pr.p_price += pr.actualPrice*(pr.quantity);
			total+=pr.p_price;
		}
		return pr;
		
	}
	
	
	public void findTotalGST_basedOnCategory(Product temp)
	{
		if(temp.category=="others")
		{
			gst_others += temp.p_price;
		}
		else if(temp.category=="clothing")
		{
			gst_clothing += temp.p_price;
		}
		else if(temp.category=="luxury")
		{
			gst_luxury += temp.p_price;
		}
	}
	
	
	public void findTotalSGST_basedOnCategory(Product temp)
	{
		if(temp.category=="others")
		{
			sgst_others += temp.p_price;
		}
		else if(temp.category=="clothing")
		{
			sgst_clothing += temp.p_price;
		}
		else if(temp.category=="luxury")
		{
			sgst_luxury += temp.p_price;
		}
	}
	
	
	
	public static double getGST()
	{
		double gstOthersAmt = billing_OthersGST(gst_others);
		System.out.println("GST on others :-"+gstOthersAmt);
		double gstClothingAmt = billing_ClothingGST(gst_clothing);
		System.out.println("GST on clothing :-"+gstClothingAmt);
		double gstLuxuryAmt = billing_LuxuryGST(gst_luxury);
		System.out.println("GST on luxury :-"+gstLuxuryAmt);
		double gstTotal = gstOthersAmt + gstClothingAmt + gstLuxuryAmt;
		return gstTotal;
	}
	
	
	
	public static double getSGST()
	{
		double sgstOthersAmt = billing_OthersSGST(sgst_others);
		System.out.println("SGST on others :-"+sgstOthersAmt);
		double sgstClothingAmt = billing_ClothingSGST(sgst_clothing);
		System.out.println("SGST on clothing :-"+sgstClothingAmt);
		double sgstLuxuryAmt = billing_LuxurySGST(sgst_luxury);
		System.out.println("SGST on luxury :-"+sgstLuxuryAmt);
		double sgstTotal = sgstOthersAmt + sgstClothingAmt + sgstLuxuryAmt;
		return sgstTotal;
	}
	
	
	
	public static double get_total()
	{
		return total;
	}
	
	
	
	public String toString()
	{
		
		return quantity + " "+p_name+" for "+"Price :- Rs."+p_price;
	}

	

}
