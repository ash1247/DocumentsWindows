package com.deitel.ch17;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.deitel.ch17.AccountRecord;

public class CreateTextFile {
	
	private Formatter output;
	// enable user to open file
	public void openFile()
	{
		try
		{
			output = new Formatter( "clients.txt" );
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
		// object to be written to file
		AccountRecord record = new AccountRecord();
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.printf( "%s\n%s\n%s\n%s\n\n",
				"To terminate input, type the end-of-file indicator ",
				"when you are prompted to enter input.",
				"On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
				"On Windows type <ctrl> z then press Enter" );
			
		System.out.printf( "%s\n%s",
				"Enter account number (> 0), first name, last name and balance.",
				"? " );
		
		while( input.hasNext() )
		{
			try
			{
				record.setAccount( input.nextInt() ); // read account number
				record.setFirstName( input.next() ); // read first name
				record.setLastName( input.next() ); // read last name
				record.setBalance( input.nextDouble() ); // read balance
				
				if( record.getAccount() > 0)
				{
					output.format( "%d %s %s %.2f\n", record.getAccount(),
							record.getFirstName(), record.getLastName(),
							record.getBalance() );
				}
				else
				{
					System.out.println(
							"Account number must be greater than 0." );
				} // end else
			} // end try
			catch ( FormatterClosedException formatterClosedException )
			{
				System.err.println( "Error writing to file." );
				return;
			} // end catch
			catch ( NoSuchElementException elementException )
			{
				System.err.println( "Invalid input. Please try again." );
				input.nextLine(); // discard input so user can try again
			} // end catch
			
			System.out.printf( "%s %s\n%s", "Enter account number (>0),",
						"first name, last name and balance.", "? " );
		} // end while
	}
			
		// close file
		public void closeFile()
		{
			if ( output != null )
				output.close();
		} // end method closeFile
} // end class CreateTextFile
			
			


