import java.util.Scanner;

public class Ex2_30 {

	public static void main(String[] args)
	{
		int n;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Please enter the integer: ");
		n = input.nextInt();
		
		System.out.printf("%d   %d   %d   %d   %d", (n / 10000),
			(n % 10000 / 1000), (n % 10000 % 1000 / 100), 
			(n % 10000 % 1000 % 100 / 10), 
			(n % 10000 % 1000 % 100 % 10) );
	}
}
