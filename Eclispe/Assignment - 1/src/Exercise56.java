//Exercise 5.6
//A program to calculate salvage value
import java.util.Scanner;
public class Exercise56 {
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Please enter purchase price = ");
		double purchasePrice = input.nextDouble();
		
		System.out.print(" Please enter depreciation = ");
		double depreciation = input.nextDouble();
		
		System.out.print(" Please enter years of service = ");
		double yearsOfService = input.nextDouble();
		
		double salvageValue = 0;
		
		salvageValue = purchasePrice - ( depreciation * yearsOfService);
		
		System.out.printf(" Salvage value is %.3f\n", salvageValue);
		
	}
}
