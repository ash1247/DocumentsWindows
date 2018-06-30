/***********************************************************************
 * Sales Commission Calculator
 * @Ashikul Hosen
 * email: sagor.ashikul@gmail.com
 * version 1.0
 ***********************************************************************/
import java.util.Scanner;

public class Ex4_19 {
	
	private double total;
	
	public void enterItem(int itemNo)
	{
		if (itemNo == 1)
			total += 239.99;
			
		else if (itemNo == 2)
			total += 129.75;
			
		else if (itemNo == 3)
			total += 99.95;
			
		else if (itemNo == 4)
			total += 350.89;
	}
	
	public double getSalesTotal()
	{
		return total;
	}
	
	public double calculateCommission()
	{
		return ( 200 + ((total * 9)/100) );
	}
	
	public static void main(String[] args)
	{
		int item = 0;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Ex4_19 salesCom = new Ex4_19();
		while( item != 5)
		{
			System.out.printf("Enter the number(1-4) of the item sold (5 to exit): ");
			item = input.nextInt();
			salesCom.enterItem( item );
		}
		if (salesCom.getSalesTotal() > 0 )
		{
			System.out.printf("\n\nCalculating *********\n");
			System.out.printf("\nWeekly Commission\n");
			System.out.printf("Weekly total sales: %.2f\n", salesCom.getSalesTotal() );
			System.out.printf("Weekly earning: %.2f\n", salesCom.calculateCommission() );	
		}
		else
			System.out.printf("You didn't input any number.\n");
		
	}

}
