
public class BasePlusCommissionEmployeeTest9_7 {

	public static void main( String[] args )
	{
	BasePlusCommissionEmployee9_11 employee =
				new BasePlusCommissionEmployee9_11(
				"Bob", "Lewis", "333-33-3333", 5000, 
				.04, 300 );
	
	System.out.println("Employee information obtained by get methods: \n" );
	System.out.printf( "%s %s\n", "First name is", employee.getFirstName() );
	System.out.printf( "%s %s\n", "Last name is", employee.getLastName() );
	System.out.printf( "%s %s\n", "Social security number is", employee.getSocialSecurityNumber() );
	System.out.printf( "%s %.2f\n", "Gross sales is", employee.getGrossSales());
	System.out.printf( "%s %.2f\n", "Commission rate is", employee.getCommissionRate());
	System.out.printf( "%s %.2f\n", "Base salary is", employee.getBaseSalary()) ;

	}
	
}