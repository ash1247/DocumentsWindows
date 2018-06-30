//Exercise 5.8
//A program that continues to ask the user to give input of a , t ,u and calculates distance
import java.util.Scanner;
public class Exercise58 {
	public static void main(String [] args)
	{
		int count ;
		double u , a , t , distance;
		
		Scanner input = new Scanner(System.in);
		
		while (true){
			
		
		
		System.out.print("Please enter initial velocity(u) (in mps): ");
		u = input.nextDouble();
		System.out.print("Please enter acceleration(a) (in mps^2): ");
		a = input.nextDouble();
		System.out.print("Please enter time(t) (in second): ");
		t = input.nextDouble();
		
		distance = (u * t) + ((a * t * t) / 2);
		
		System.out.printf("Distance = %f\n", distance);
		
		}
		
		
	}
}
