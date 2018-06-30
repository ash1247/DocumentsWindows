//Invoice Class
public class Ex3_13 {
	
	private String partNum;
	private String partDes;
	private int quantity;
	private double pricePerItem;
	
	public Ex3_13(String num, String des, int quan, double ppi)
	{
		partNum = num;
		partDes = des;
		
		if ( quan < 0 && ppi < 0 )
		{
			quantity = 0;
			pricePerItem = 0;
			
		}
		else 
		{
			quantity = quan;
			pricePerItem = ppi;
		}
	}
	
	public void setEverything(String num, String des, int quan, double ppi)
	{
		partNum = num;
		partDes = des;
		quantity = quan;
		pricePerItem = ppi;
	}
			
	public String getPartNum()
	{
		return partNum;
	}
	
	public String getPartDes()
	{
		return partDes;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public double getPricePerItem()
	{
		return pricePerItem;
	}
	
	public double getInvoiceAmount()
	{
		return quantity * pricePerItem;
	}
	
	public void displayMessage()
	{
		System.out.printf("%-25s %-20s %1s %25s", "Part Number",
										"Part Description",
								"Quantity", "Price Per Item");
		System.out.printf("\n%-25s %-20s %d %25.2f$ ", partNum, partDes
										, quantity, pricePerItem);
		System.out.printf("\n\nTotal price = %.2f\n\n", quantity * pricePerItem);
	}
	

}
