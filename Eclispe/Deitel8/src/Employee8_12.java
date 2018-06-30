
public class Employee8_12 {

	private String firstName;
	private String lastName;
	private static int count = 0;
	
	public Employee8_12( String first, String last )
	{
		firstName = first;
		lastName = last;
		
		++count;
		System.out.printf("Employee constructor: %s %s; count = %d\n", 
						firstName, lastName, count);
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public static int getCount()
	{
		return count;
	}
}
