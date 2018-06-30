//Program for Calculating Body Mass Index
import java.util.Scanner;

public class Ex233 {
	public static void main (String [] args)
	{
		Scanner input = new Scanner ( System.in);
		
		double weight;
		double height;
		double bmi;
		
		
		System.out.print( "Please type in your body weight(in Kilograms): ");
		weight = input.nextDouble();
		
		System.out.print( "Please type in your body height(in Meters): ");
		height = input.nextDouble();
		
		
		bmi = (weight / ( height * height));
		
		if (bmi > 0 && bmi < 18.5)
			System.out.printf("BMI = %.2f, Underweight.", bmi);
		if (bmi > 18.5 && bmi < 24.9 )
			System.out.printf("BMI = %.2f, Normal.", bmi);
		if (bmi > 25 && bmi < 29.9)
			System.out.printf("BMI = %.2f, Overweight.", bmi);
		if (bmi >= 30)
			System.out.printf("BMI = %.f, Obese.", bmi);
	}


}
