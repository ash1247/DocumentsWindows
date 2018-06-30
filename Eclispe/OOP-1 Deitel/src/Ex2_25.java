import java.util.Scanner;
public class Ex2_25 {
	public static void main(String[]args)
	{
		int x;
		@SuppressWarnings("resource")
		Scanner input =new Scanner (System.in);
		System.out.println("Please enter the integer: ");
		x = input.nextInt();
		
			if(x % 2 == 0)
				System.out.println("Even.");
			else 
				System.out.println("Odd."); 
		
	}

}
