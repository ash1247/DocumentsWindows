import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling11_2 {

	// demonstrates throwing an exception when a divide-by-zero occurs
		public static int quotient( int numerator, int denominator )
		{
			return numerator / denominator; // possible division by zero
		} // end method quotient

		public static void main( String[] args )
		{
			Scanner scanner = new Scanner( System.in ); // scanner for input
			boolean continueLoop = true; // determines if more input is needed
		
		do
		{
			try // read two numbers and calculate quotient
			{
				System.out.print( "Please enter an integer numerator: " );
				int numerator = scanner.nextInt();
				System.out.print( "Please enter an integer denominator: " );
				int denominator = scanner.nextInt();
				int result = quotient( numerator, denominator );
				System.out.printf( "\nResult: %d / %d = %d\n", numerator,
						denominator, result );
				continueLoop = false; // input successful; end looping
			} // end try
			
			catch ( InputMismatchException inputMismatchException )
			{
				System.err.printf( "\nException: %s\n",
									inputMismatchException );
				scanner.nextLine(); // discard input so user can try again
				System.out.println(
						"You must enter integers. Please try again.\n" );
			} // end catch
			
			catch ( ArithmeticException arithmeticException )
			{
				System.err.printf( "\nException: %s\n", arithmeticException );
				System.out.println(
						"Zero is an invalid denominator. Please try again.\n" );
			} // end catch
			/* you can use catch ( Type1 | Type2 | Type3 e ) for 
			 * multiple exception in one catch
			 */
		} 
		while ( continueLoop );
	}
}
