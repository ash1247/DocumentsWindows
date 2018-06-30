
public class EmployeeTest8_13 {

	public static void main( String[] args )
	{
		System.out.printf("Employees before instantiation: %d\n", 
							Employee8_12.getCount() );
		
		Employee8_12 e1 = new Employee8_12("Susan", "Baker" );
		Employee8_12 e2 = new Employee8_12("Bob", "Blue");
		
		System.out.println("\nEmployees after instantiation: ");
		System.out.printf("via e1.getcount(): %d\n", e1.getCount() );
		System.out.printf("via e2.getcount(): %d\n", e2.getCount() );
		System.out.printf("via Employee.getCount(): %d\n", Employee8_12.getCount() );
		
		System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n", 
				e1.getFirstName(), e1.getLastName(), e2.getFirstName(),
				e2.getFirstName() );
		
		e1 = null;
		e2 = null;
	}
}
