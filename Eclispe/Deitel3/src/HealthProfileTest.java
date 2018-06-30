import java.util.Scanner;

public class HealthProfileTest {
	
	public static void main(String[] args)
	{
	
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter your first name:");
		String fName = input.nextLine();
		System.out.printf("Enter your last name:");
		String lName = input.nextLine();
		System.out.printf("Enter your gender(Male or Female):");
		String gende = input.nextLine();
		System.out.printf("Enter the day of your birth:");
		int da = input.nextInt();
		System.out.printf("Enter the month of your birth:");
		int mont = input.nextInt();
		System.out.printf("Enter the year of your birth:");
		int yea = input.nextInt();
		
		System.out.printf( "Enter your body weight(in Kilograms): ");
		double weight = input.nextDouble();
		System.out.printf( "Enter your body height(in Centimeters): ");
		double height = input.nextDouble();
		
		Ex3_17 cal = new Ex3_17( fName, lName, gende, da, mont, yea, weight, height);
		
		cal.displayMessage();
	
		
	}

}