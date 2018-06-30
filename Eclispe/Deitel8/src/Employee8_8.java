
public class Employee8_8 {

	private String firstName;
	private String lastName;
	private Date8_7 birthDate;
	private Date8_7 hireDate;
	
	public Employee8_8 ( String first, String last, Date8_7 dateOfBirth, Date8_7 dateOfHire )
	{
		firstName = first;
		lastName = last;
		birthDate = dateOfBirth;
		hireDate = dateOfHire;
	}
	
	public String toString()
	{
		return String.format("%s, %s  Hired: %s  Birthday: %s", 
				lastName, firstName, hireDate, birthDate );
	}
}
