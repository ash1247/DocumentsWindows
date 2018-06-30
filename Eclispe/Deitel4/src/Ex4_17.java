/***********************************************************************
 * Gas Mileage Calculator.
 * @Ashikul Hosen
 * email: sagor.ashikul@gmail.com
 * version 1.0
 ***********************************************************************/
import java.util.Scanner;

public class Ex4_17 {

	public void displayMessage()
	{
		System.out.printf( "Welcome to the Gas Mileage Calculator\n");
	}
	
	public void average()
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int totalMiles = 0;
		int totalGas = 0;
		int gasUsed;
		int milesDriven;
		double average1;
		double average2;
		
		System.out.printf("\nPlease enter the miles driven for this trip or -1 to exit: ");
		milesDriven = input.nextInt();
		
		while( milesDriven != -1)
		{
			System.out.printf("\nPlease enter the used gallons of gas for this trip: ");
			gasUsed = input.nextInt();
			
			totalMiles = totalMiles + milesDriven;
			totalGas = totalGas + gasUsed;
			
			average1 = ((double)milesDriven / (double)gasUsed);
			
			System.out.printf("\nGas Mileage for this trip is %.2f\n\n", average1 );
			
			System.out.println("***************************************************");
			
			System.out.printf("\nPlease enter the miles driven for this trip or -1 to exit and count the total Total Gas Mileage: ");
			milesDriven = input.nextInt();
		}
		
		if( totalMiles != 0 && totalGas != 0)
		{
			average2 = ((double)totalMiles / (double)totalGas);
			
			System.out.printf("\nTotal of the miles entered is %d", totalMiles);
			System.out.printf("\nTotal of the gas entered is %d", totalGas);
			
			System.out.printf("\nGas Mileage is %.2f", average2 );
		}
		
		else
			System.out.printf("\nNo data were entered.");
	}
	
	public static void main(String[] args)
	{
		Ex4_17 gasMileage = new Ex4_17();
		
		gasMileage.displayMessage();
		gasMileage.average();
	}
}