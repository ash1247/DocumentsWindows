// Test of class named Ex3_13
public class InvoiceTest {
	
	public static void main(String [] args)
	{
		Ex3_13 invoice1 = new Ex3_13("002150S54", "New America Hammer", 2, 5.50);
		Ex3_13 invoice2 = new Ex3_13("002150S99", "Star Nails", 250, .05);
		invoice1.displayMessage();
		
		invoice2.displayMessage();
		
	}

}
