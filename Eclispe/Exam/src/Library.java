import java.util.ArrayList;

public class Library {
	
	private String address;
	private String title; 
	
	Book book;
	
	ArrayList<String> items = new ArrayList<String>();

	
	public Library(String addrss)
	{
		address =  addrss;
	}
	
	public void setAddress(String addrss)
	{
		address = addrss; 
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public static void printOpeningHours()
	{
		System.out.println("Libraries are open daily from 9am to 5pm");
	}
	
	public void printAddress()
	{
		System.out.println(" " + getAddress() );
	}
	
	public void setTitle(String tile)
	{
		 book.setTitle(tile);
		
	}
	public String getTitle()
	{
		return title;
	}
	
	public void addBook(Book book)
	{
		
		String s = book.getTitle();
		items.add(s);
	}
	
	public void borrowBook(String s) {
		if(items.contains(s))
			items.remove(s);
		else if(items.isEmpty())
			System.out.println("Sorry,this book is not in our catalog.");
		else if(!items.contains(s))
			System.out.println("Sorry, this book is already borrowed.");
		

    }
	
	public void returnBook(String s) {
		items.add(s);
    }
	
	public void printAvailableBooks()
	{
		if(!items.isEmpty())
			System.out.println(items);
		else
			System.out.println("Our library doesn't have this books");
	}
	
	
	public static void main(String[] args)
	{
		Library firstLibrary = new Library("10 Main st");
		Library secondLibrary = new Library("228 Liberty St.");
		
		firstLibrary.addBook(new Book("The Da Vinci Code") );
		firstLibrary.addBook(new Book("Le Petit Prince") );
		firstLibrary.addBook(new Book("A tale of Two Cities") );
		firstLibrary.addBook(new Book("The Lords of the Rings") );
		
		System.out.println("Library hours");
		printOpeningHours();
		System.out.println();
		
		System.out.println("Library addresses");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();
		
		//try to borrow lotr from both libararies & method to take book name
		System.out.println("Borrowing The Lord of the Rings");
		firstLibrary.borrowBook("The Lords of the Rings");
		firstLibrary.borrowBook("The Lords of the Rings");
		secondLibrary.borrowBook("The Lords of the Rings");
		System.out.println();
		
		System.out.println("Books available in the first library");
		firstLibrary.printAvailableBooks();
		System.out.println();
		
		System.out.println("Books available in the second library");
		secondLibrary.printAvailableBooks();
		System.out.println();
		
		System.out.println("Returning The Lord of the Rings");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();
		
		System.out.println("Books available in the first library");
		firstLibrary.printAvailableBooks();
	}

}
