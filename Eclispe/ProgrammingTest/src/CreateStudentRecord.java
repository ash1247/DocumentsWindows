import java.io.*;
import java.util.*;

public class CreateStudentRecord {
	
	private Formatter output;
	public int rows;
	Scanner input = new Scanner(System.in);
	StudentRecord record = new StudentRecord();
	
		
	// enable user to open file
	public void openFile()		
	{
		try
		{
			output = new Formatter( "TutorialMarks.txt" );
		}
		catch ( SecurityException securityException )
		{
			System.err.println(
					"You do not have write access to this file." );
			System.exit( 1 ); // terminate the program
		} // end catch
		catch ( FileNotFoundException fileNotFoundException )
		{
			System.err.println( "Error opening or creating file." );
			System.exit( 1 ); // terminate the program
		} // end catch
	} // end method openFile
		
	public void addRecords()
	{	
		int i;
		System.out.printf( "How many rows you want to enter: ");
		rows = input.nextInt();
		System.out.println();
		
		for( i = 1; i <= rows; i++)
		{
			try
			{
				System.out.printf( "%s\n",
					"Enter student ID, name, tutorial no and marks using Whitespace.");
						
				record.setId( input.nextInt() ); // read account number
				record.setName( input.next() ); // read first name
				record.setTutorialNo( input.nextInt() ); // read last name
				record.setMarks( input.nextDouble() ); // read balance
					
				if( record.getId() > 0)
				{
					output.format( "%d %s %d %.2f\n", record.getId(),
						record.getName(), record.getTutorialNo(),
						record.getMarks() );
				}
				else
				{
					System.out.println(
						"Student ID should not be 0." );
				} // end else
			} // end try
			catch ( FormatterClosedException formatterClosedException )
			{
				System.err.println( "Error writing to file." );
				return;
			} // end catch
			catch ( NoSuchElementException elementException )
			{
				System.err.println( "Invalid input. Please try again.\n" );
				input.nextLine(); // discard input so user can try again
				i = i - 1;
			} // end catch
			
		} // end for
	}
	
	public void closeFile()
	{
		if ( output != null )
			output.close();

	} // end method closeFile
	
	public void openFile2()
	{
		try
		{
			input = new Scanner( new File( "TutorialMarks.txt" ) );
		} // end try
		
		catch ( FileNotFoundException fileNotFoundException )
		{
			System.err.println( "Error opening file." );
			System.exit( 1 );
		} // end catch
	} // end method openFile

		
	// read record from file
	public void readRecords()
	{	
		System.out.printf( "%-15s%-15s%-15s%10s\n", "Student ID",
			"Student Name", "Tutorial No", "Marks" );
		try // read records from file
		{			
			for(int i = 1; i <= rows; i++)
			{	
				record.setId( input.nextInt() ); // read account number
				record.setName( input.next() ); // read first name
				record.setTutorialNo( input.nextInt() ); // read last name
				record.setMarks( input.nextDouble() ); // read balance
				
				// display record contents
				System.out.printf( "%-15d%-15s%-15s%10.2f\n",
							record.getId(), record.getName(),
						record.getTutorialNo(), record.getMarks() );
			} // end for
		} // end try	
			
		catch ( NoSuchElementException elementException )
		{	
			System.err.println( "File improperly formed." );
			input.close();
			System.exit( 1 );
		} // end catch
		catch ( IllegalStateException stateException )
		{
			System.err.println( "Error reading from file." );
			System.exit( 1 );
		} // end catch
	} // end method readRecords
		
	public void closeFile2()
	{
	if ( input != null )
		input.close(); // close file
	}	
	
} // end class 
				
			
