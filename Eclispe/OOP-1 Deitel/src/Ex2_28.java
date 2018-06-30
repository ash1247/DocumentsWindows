import java.lang.Math;
import java.util.Scanner;

public class Ex2_28 {

	public static void main(String[] args)
	{
		float r;
	
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Please enter the radius: ");
		r = input.nextFloat();
		
		System.out.printf("diameter = %f\n", 2 * r );
		System.out.printf("circumference = %f\n", 2 * r * Math.PI);
		System.out.printf("area = %f\n", r * r * Math.PI);
	}
}
