package assignment2;
import java.util.*;
public class Shopping_Cart {

	static int product_id=0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char c;
		List<Product> list = new ArrayList<Product>();
		do
		{
			
			
			System.out.println("Enter a to add items,r to remove items,d to display items, t to get total and e to exit");
			c=sc.next().charAt(0);
			switch(c)
			{
			case 'a':
				System.out.println("Items");
				Product.show_items();
				System.out.println("Enter item");
				String item = sc.next();
				System.out.println("Enter Quantity");
				int qty = sc.nextInt();
				Product p = Product.add_items(item,qty);
				list.add(p);
				break;
				
				
			case 'r':
				System.out.println("Enter item to delete");
				String r_item = sc.next();
				System.out.println("Enter quantity to delete");
				int r_qty = sc.nextInt();
				for(Product pp : list)
				{
					
					if(pp.p_name.equals(r_item))
					{
						if(pp.quantity>=r_qty)
						{
							Product pr = pp;
							pr.quantity -= r_qty;
							pr.removeItem(pr);
							if(pr.quantity==0)
							{
								list.remove(pr);
							}
							break;
						}
					}
				}
				break;
				
				
			case 'd':
				for(Product pi:list)
				{
					System.out.println(pi);
				}
				break;
				
				
			case 't':
				
				
				double total = Product.get_total();
				System.out.println("Total bill is of Rs"+total);
				
				
				for(Product pt:list)
				{
					pt.findTotalGST_basedOnCategory(pt);
					pt.findTotalSGST_basedOnCategory(pt);
				}
				
				
				double total_gst=0;
				total_gst += Product.getGST();
				System.out.printf("Total GST on bill is of Rs%.1f",total_gst);
				System.out.println();
				
				
				double total_sgst=0;
				total_sgst += Product.getSGST();
				System.out.printf("Total SGST on bill is of Rs%.1f",total_sgst);
				System.out.println();
				
				
				
				double final_bill = total + total_gst + total_sgst;
				System.out.printf(String.format("Final Bill is of Rs%.1f",final_bill));
				System.out.println();
				
				
				
				
				System.out.println("Thanks for shopping...");
				c='e';
				break;
				
			}
			
		}while(c!='e');
		
		

	}
	

}
