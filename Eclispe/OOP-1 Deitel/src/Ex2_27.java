import java.util.Scanner;

public class Ex2_27 {

	public static void main(String[]args)
	{
		int n ;
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the number of rows you want: ");
		n = input.nextInt();
		
		for( int i = 1; i <= n; i++)
		{
			if(i % 2 == 0)
				System.out.println("********");
			else 
				System.out.println(" ********"); 
		}
	}

}
