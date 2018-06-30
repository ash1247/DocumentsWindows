import java.util.EnumSet;

public class EnumTest8_11 {

	public static void main(String[] args)
	{
		System.out.println( "All Books:\n");
		
		for ( Book8_10 book : Book8_10.values() )
		System.out.printf( "%-10s%-45s%s\n", book, 
							book.getTitle(), book.getCopyrightYear() );
	
		System.out.println( "\nDisplay a range of enum constants:\n" );
		
		for ( Book8_10 book : EnumSet.range(Book8_10.JHTP, Book8_10.CPPHTP) )
			System.out.printf( "%-10s%-45s%s\n", book, 
					book.getTitle(), book.getCopyrightYear() );

	}
}
