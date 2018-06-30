
public enum Book8_10{

	JHTP( "Java" , "2012" ),
	CHTP( "C", "2007"),
	IW3HTP( "In", "2005" ),
	CPPHTP( "C++", "2002"),
	VBHTP( "Visual", "2011" ),
	CSHARPHTP( "C#", "2011" );
	
	
	private final String title;
	private final String copyrightYear;
	
	Book8_10( String bookTitle, String year )
	{
		title = bookTitle;
		copyrightYear = year; 
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getCopyrightYear()
	{
		return copyrightYear;
	}
}
