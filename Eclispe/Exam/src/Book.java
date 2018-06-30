
public class Book {
	
	private String title;
	boolean borrowed = false;
	
	//Creates a new book
	public Book(String bookTitle)
	{
		 title = bookTitle;
	}
	
	//mark the book as rented
	public void rented()
	{
		borrowed = true;
	}
	//marks the book as not rented
	public void returned()
	{
		borrowed = false;
	}
	//returns true if the book is rented false otherwise
	public boolean isBorrowed()
	{
		return borrowed;	
	}
	//Returns the title of the book
	public void setTitle(String tile)
	{
		title = tile;
	}
	
	public String getTitle()
	{
		return title;	
	}

	public static void main(String[] args)
	{
		Book example = new Book("The Da Vinci Code");
		System.out.println("Title: " + example.getTitle() );
		System.out.println("Borrowed?(Should be false)" + example.isBorrowed() );
		example.rented();
		System.out.println("Borrowed?(Should be true)" + example.isBorrowed() );
		example.returned();
		System.out.println("Borrowed?(Should be false)" + example.isBorrowed() );
	}
}
