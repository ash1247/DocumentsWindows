import com.deitel.jhtp.ch08.Time1_8_1;

public class Time_1_Test8_2 {
	
	public static void main(String [] args)
	{
		Time1_8_1 time = new Time1_8_1();
		
		System.out.printf("The initial universal time is: ");
		System.out.println(time.toUniversalString() );
		System.out.print("The initial standard time is: ");
		System.out.println( time.toString() );
		System.out.println();;
		
		time.setTime(07, 27, 6);
		System.out.print("Universal time after setTime is: ");
		System.out.println( time.toUniversalString() );
		System.out.print("Standard time after setTime is: " );
		System.out.println( time.toString() );
		System.out.println();
		
		try
		{
			time.setTime(99, 99, 99);
		}
		catch ( IllegalArgumentException e )
		{
			System.out.printf("Exception: %s\n\n", e.getMessage() ) ;	
		}
		
		System.out.println("After attempting invalid settings: ");
		System.out.print("Universal time: ");
		System.out.println( time.toUniversalString() );
		System.out.print("Standard time: ");
		System.out.println( time.toString() );
	}

}