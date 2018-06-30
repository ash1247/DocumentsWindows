//Exercise 4.14
//A program that turns price of an item to paisa
import java.util.Scanner;
public class Exercise414 {
		
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		float price = 0;
		float paisa = 0;
		System.out.print("Please type in the price of the item: ");
		
		price = input.nextFloat();
		
		paisa = (float) price * 100;
		int paisa2 = (int)paisa ;  //changing float to int
		
		System.out.printf("Paisa = %d ", paisa2);
		
	}
}
