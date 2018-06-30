import java.util.Scanner;

public class Ex2_26 {
	
		public static void main(String[]args)
		{
			int x, y;
			@SuppressWarnings("resource")
			Scanner input = new Scanner (System.in);
			
			System.out.println("Please enter the first integer: ");
			x = input.nextInt();
			
			System.out.println("Please enter the second integer: ");
			y = input.nextInt();
			
				if(y % x == 0 )
					System.out.println("First integer is a multiple of second inteteger.");
				else 
					System.out.println("First integer is not a multiple of second inteteger."); 
			
		}

	

}
