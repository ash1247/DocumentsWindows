
public class ATM {

	private boolean userAuthenticated;
	private int currentAccountNumber;
	private Screen screen;
	private Keypad keypad;
	private CashDispenser cashDispenser;
	private DepositSlot depositSlot;
	private BankDatabase bankDatabase;
	
	private static final int BALANCE_INQUIRY = 1;
	private static final int WITHDRAWAL = 2;
	private static final int DEPOSIT = 3;
	private static final int EXIT = 4;
	
	public ATM()
	{
		userAuthenticated = false;
		currentAccountNumber = 0;
		screen = new Screen();
		keypad = new Keypad();
		cashDispenser = new CashDispenser();
		depositSlot = new DepositSlot();
		bankDatabase = new BankDatabase();
	}
	
	public void run()
	{
		while( true )
		{
			while( !userAuthenticated )
			{
				screen.displayMessageLine("\nWelcome!");
				authenticateUser();
			}
			
			performTransactions();
			userAuthenticated = false;
			currentAccountNumber = 0;
			screen.displayMessageLine("\nThank you! Goodbye!");
		}
	}
	
	private void authenticateUser()
	{
		screen.displayMessage( "\nPlease enter your account number: " );
		int accountNumber = keypad.getInput(); // input account number
		screen.displayMessage( "\nEnter your PIN: " ); // prompt for PIN
		int pin = keypad.getInput(); // input PIN
	
		// set userAuthenticated to boolean value returned by database
		userAuthenticated =
				bankDatabase.authenticateUser( accountNumber, pin );
	
		// check whether authentication succeeded
		if ( userAuthenticated )
		{
			currentAccountNumber = accountNumber; // save user's account #
		} // end if
		else
			screen.displayMessageLine(
					"Invalid account number or PIN. Please try again." );
	} // end method authenticateUser
	
	// display the main menu and perform transactions
	private void performTransactions()
	{
		// local variable to store transaction currently being processed
		Transaction currentTransaction = null;
		boolean userExited = false; // user has not chosen to exit
		
		// loop while user has not chosen option to exit system
		while ( !userExited )
		{
			// show main menu and get user selection
			int mainMenuSelection = displayMainMenu();
		
			// decide how to proceed based on user's menu selection
			switch ( mainMenuSelection )
			{
				// user chose to perform one of three transaction types
				case BALANCE_INQUIRY:
				case WITHDRAWAL:
				case DEPOSIT:
	
				// initialize as new object of chosen type
				currentTransaction =
				createTransaction( mainMenuSelection );
	
				currentTransaction.execute(); // execute transaction
				break;
					case EXIT: // user chose to terminate session
						screen.displayMessageLine( "\nExiting the system..." );
						userExited = true; // this ATM session should end
						break;
					default: // user did not enter an integer from 1-4
						screen.displayMessageLine(
								"\nYou did not enter a valid selection. Try again." );
						break;
			} // end switch
		} // end while
	} // end method performTransactions
		
	// display the main menu and return an input selection
	private int displayMainMenu()
	{
		screen.displayMessageLine( "\nMain menu:" );
		screen.displayMessageLine( "1 - View my balance" );
		screen.displayMessageLine( "2 - Withdraw cash" );
		screen.displayMessageLine( "3 - Deposit funds" );
		screen.displayMessageLine( "4 - Exit\n" );
		screen.displayMessage( "Enter a choice: " );
		return keypad.getInput(); // return user's selection
	} // end method displayMainMenu
		
	// return object of specified Transaction subclass
	private Transaction createTransaction( int type )
	{
		Transaction temp = null; // temporary Transaction variable
		// determine which type of Transaction to create
		switch ( type )
		{
			case BALANCE_INQUIRY: // create new BalanceInquiry transaction
				temp = new BalanceInquiry(
						currentAccountNumber, screen, bankDatabase );
				break;
			case WITHDRAWAL: // create new Withdrawal transaction
				temp = new Withdrawal( currentAccountNumber, screen,
						bankDatabase, keypad, cashDispenser );
				break;
			case DEPOSIT: // create new Deposit transaction
				temp = new Deposit( currentAccountNumber, screen,
						bankDatabase, keypad, depositSlot );
				break;
		} // end switch
		
			return temp; // return the newly created object
	} // end method createTransaction
} // end class ATM

