import java.util.Scanner;

public class Ex2_32 {

	public static void main(String[]args)
	{
		int n, x = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter how many numbers you want to input: ");
		n = input.nextInt();
		for( int count = 1; count <= n; count++)
		{
		System.out.printf("Please enter the %d integer number: ", count);
		x = input.nextInt();
		
			if(x < 0)
				System.out.println("Negative");
			else 
				if ( x > 0)
				System.out.println("Postive");
				else
					System.out.println("Zero");
		}
	

	}
}
