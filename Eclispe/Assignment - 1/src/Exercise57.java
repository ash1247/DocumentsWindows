//Exercise 5.7
//A program that shows closest small and large integers of the given input.
import java.util.Scanner;
public class Exercise57 {
	public static void main(String [] args)
	
	{
		Scanner input = new Scanner(System.in);
		float num ;
		
		System.out.print("Plese enter a number: ");
		num = input.nextFloat();
		
		float numLarge = num +  1.00000000000000000000F;
		float numSmall = num - .00000000000000000000001F;
		
		int numLarge1 = (int)numLarge;
		int numSmall1 = (int)numSmall;
		
		
		System.out.printf(" %d         %.2f        %d", numSmall1, num, numLarge1 );
	}
	
}
