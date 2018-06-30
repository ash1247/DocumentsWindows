/***********************************************************************
 * largest number
 * @Ashikul Hosen
 * email: sagor.ashikul@gmail.com
 * version 1.0
 ***********************************************************************/
import java.util.Scanner;
public class Ex4_21 {

	public static void main(String [] args)
	{
		int counter = 0;
		int number = 0;
		int largest = 0;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		while( counter < 10)
		{
			System.out.printf("Please enter a number:");
			number = input.nextInt();
			System.out.println();
			counter++;
			
			if(number > largest)
				largest = number;
		}
		
		
		System.out.printf("Largest Number is: %d\n", largest);
		
	}
}
