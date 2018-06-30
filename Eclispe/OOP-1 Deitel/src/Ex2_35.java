import java.util.Scanner;

public class Ex2_35 {

	public static void main(String[] args)
	{
		float totalMiles, costGas, averageMiles, parkingFees, tollsper, totalCost;
	
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Please enter the total miles driven per day: ");
		totalMiles = input.nextFloat();
		System.out.printf("Please enter the cost per gallong of gasoline: ");
		costGas = input.nextFloat();
		System.out.printf("Please enter the average miles per gallon: ");
		averageMiles = input.nextFloat();
		System.out.printf("Please enter the parking fees per gallon: ");
		parkingFees = input.nextFloat();
		System.out.printf("Please enter the tolls per day: ");
		tollsper = input.nextFloat();
		
        totalCost = ((totalMiles / averageMiles) * costGas) + parkingFees + tollsper;
		
		System.out.printf("Total Cost = %.2f $\n", totalCost);
	}
}
