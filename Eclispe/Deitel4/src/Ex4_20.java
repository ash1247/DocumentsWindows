/***********************************************************************
 * Salary Calculator
 * @Ashikul Hosen
 * email: sagor.ashikul@gmail.com
 * version 1.0
 ***********************************************************************/
import java.util.Scanner;

public class Ex4_20 {
	
	private int hours;
	private int hourlyRate;
	private double salary;

	public Ex4_20(int hours, int hourlyRate)
	{
		this.hours = hours;
		this.hourlyRate = hourlyRate;
	}
	
	public void setHours(int hours)
	{
		this.hours = hours;
	}
	
	public int getHours()
	{
		return hours;
	}
	
	public void setHourlyRate(int hourlyRate)
	{
		this.hourlyRate = hourlyRate;
	}
	
	public int getHourlyRate()
	{
		return hourlyRate;
	}
	
	public double setSalary(int hours, int hourlyRate)
	{
		{if(hours < 40)
			salary = hours * hourlyRate; 
		
		else if(hours >= 40)
		{
			salary = (40 * hourlyRate) + ( (hours - 40) * 1.5 * hourlyRate);
		}
		
		}
		return salary;
			
	}
	
	
	public static void main(String [] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int hours = 0;
		int hourlyRate = 0;
		int count = 0;
		Ex4_20 salCal = new Ex4_20(hours, hourlyRate);
		while(count < 3)
		{
			System.out.printf("Enter employee %d's worked hours: ", (count + 1) ); 
			hours = input.nextInt();
			System.out.printf("\nEnter employee %d's hourly rate: ", (count + 1) );
			hourlyRate = input.nextInt();
			System.out.printf("\nEnter employee %d's gross pay: %.2f", (count + 1), salCal.setSalary(hours, hourlyRate) );
			count++;
			System.out.println();
			System.out.println();
		}
		
		
	}
}
