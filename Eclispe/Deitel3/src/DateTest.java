import java.util.Scanner;

public class DateTest {

	public static void main(String [] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.printf("Day:");
		int day = input.nextInt();
		System.out.printf("Month:");
		int month = input.nextInt();
		System.out.printf("Year:");
		int year = input.nextInt();
		
		Ex3_15 date = new Ex3_15(day, month, year);
		date.displayDate();
	}
}