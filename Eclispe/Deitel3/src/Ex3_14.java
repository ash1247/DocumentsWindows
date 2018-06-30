
public class Ex3_14 {
	
	private String firstName;
	private String lastName;
	private double salary;
	
	public Ex3_14(String fName, String lName, double slry)
	{
		firstName = fName;
		lastName = lName;
		if( slry >= 0)
			salary = slry;
		else
			salary = 0;
	}
	
	public void setFirstName(String fName)
	{
		firstName = fName;
	}
	
	public void setLastName(String lName)
	{
		lastName = lName;
	}
	
	public void setSalary(double slry)
	{
			salary = slry;	
	}
	
	public String getFirstName()
	{
		return firstName;
		
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public double raise()
	{
		return (salary + ((salary * 10)/ 100));
	}
	
	public void displayMessage()
	{
		System.out.printf("\n%-13s %-12s\n", "First Name", "Last Name");
		System.out.printf("%-13s %-12s\n\n", firstName, lastName);
		
		System.out.printf("Salary of %s %s is %.2f annum.\n", firstName, lastName, (salary * 12) );
		
	}
	public void displayMessage2()
	{		
		System.out.printf("\nSalary of %s %s after 10%% raise is %.2f annum.\n", firstName, lastName, (raise() * 12) );
	}

}
