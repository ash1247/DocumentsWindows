//Class Heart Rate Calculator
import java.util.Scanner;

public class Ex3_16 {

	private String firstName;
	private String lastName;
	private int day;
	private int month;
	private int year;

	
	public Ex3_16(String fName, String lName, int da, int mont, int yea)
	{
		firstName = fName;
		lastName = lName;
		day = da;
		month = mont;
		year = yea;
	}
	
	public void setFirstName(String fName)
	{
		firstName = fName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setLastName(String lName)
	{
		lastName = lName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setDay(int da)
	{
		day = da;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public void setMonth(int mont)
	{
		month = mont;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setYear(int yea)
	{
		year = yea;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public double ageCalculator()
	{
		 return java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - year;
	}
	
	public double maximumHeartRates()
	{
		return (220 - ageCalculator() );
	}
	
	public double targetHeartRateLow()
	{
		return ( maximumHeartRates() *  50 / 100 );
	}
	
	public double targetHeartRateHigh()
	{
		return ( maximumHeartRates() *  85 / 100 );
	}
	
	public void displayMessage()
	{
		System.out.printf("First Name: %s\n", firstName);
		System.out.printf("Last Name: %s\n", lastName );
		System.out.printf("Date Of Birth: %d/%d/%d\n", day, month, year);
		System.out.printf("Age: %.1f\n", ageCalculator() );
		System.out.printf("Maximum Heart Rates: %.2f\n", maximumHeartRates() );
		System.out.printf("Target Heart Rate: %.2f - %.2f\n", targetHeartRateLow(), targetHeartRateHigh() );
	
	}
	
	public static void main(String[] args)
	{
	
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter your first name:");
		String fName = input.nextLine();
		System.out.printf("Enter your last name:");
		String lName = input.nextLine();
		System.out.printf("Enter the day of your birth:");
		int da = input.nextInt();
		System.out.printf("Enter the month of your birth:");
		int mont = input.nextInt();
		System.out.printf("Enter the year of your birth:");
		int yea = input.nextInt();
		
		Ex3_16 cal = new Ex3_16( fName, lName, da, mont, yea);
		
		cal.displayMessage();
		
	}
}
