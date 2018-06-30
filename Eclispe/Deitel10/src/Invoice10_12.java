
public class Invoice10_12 implements Payable10_11{
	
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice10_12( String part, String description, int count,
					double price)
	{
		partNumber = part;
		partDescription = description;
		setQuantity( count );
		setPricePerItem( price );
	}

	// set part number
	public void setPartNumber( String part )
	{
		partNumber = part; // should validate
	} // end method setPartNumber

	// get part number
	public String getPartNumber()
	{
		return partNumber;
	} // end method getPartNumber
	
	// set description
	public void setPartDescription( String description )
	{
		partDescription = description; // should validate
	} // end method setPartDescription

	// get description
	public String getPartDescription()
	{
		return partDescription;
	} // end method getPartDescription

	public void setQuantity( int count )
	{
		if( count >= 0 )
			quantity = count;
		else
			throw new IllegalArgumentException( "Quality must be >= 0");
	}
	
	// get quantity
	public int getQuantity()
	{
		return quantity;
	} // end method getQuantity

	// set price per item
	public void setPricePerItem( double price )
	{
		if ( price >= 0.0 )
			pricePerItem = price;
		else
			throw new IllegalArgumentException(
				"Price per item must be >= 0" );
	} // end method setPricePerItem

	// get price per item
	public double getPricePerItem()
	{
		return pricePerItem;
	} // end method getPricePerItem
	
	@Override
	public String toString()
	{
		return String.format("%s: \n%s: %s (%s) \n%s: %s\n%s: $%,.2f", 
				"invoice", "part number", getPartNumber(), getPartDescription(),
				"quantity", getQuantity(), "price per item", getPricePerItem() );
	}
	
	@Override
	public double getPaymentAmount()
	{
		return getQuantity() * getPricePerItem();
	}
}

