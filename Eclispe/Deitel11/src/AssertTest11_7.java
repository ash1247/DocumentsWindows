import java.util.Scanner;

public class AssertTest11_7 {

	public static void main( String[] args )
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Enter a number between 0 and 10: ");
		int number = input.nextInt();
		
		assert ( number >= 0 && number <= 10) : "bad number: " + number;
		
		System.out.printf( "You entered %d\n", number);
		
	}
}
