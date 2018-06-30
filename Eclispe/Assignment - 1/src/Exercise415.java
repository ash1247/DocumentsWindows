//Exercise 4.15
//A program that can turn Fahrenheit temp. to Celcius temp.
import java.util.Scanner;
public class Exercise415 {
		
	public static void main(String[] args)
	{
		double c = 0;
		double f = 0;
		Scanner input = new Scanner (System.in);
		
		System.out.print("PLease enter temperature in Fahrenheit: ");
		f = input.nextDouble();
		
		c = (f - 32) / 1.8;
		
		System.out.println("Fahrenheit      Celcius");
		System.out.printf (" %.3f         %.3f   ", f,c);
		
		
		
	}
	
}
