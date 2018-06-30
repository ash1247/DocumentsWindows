
public class CommissionEmployeeTest9_5 {
	
	public static void main( String[] args )
	{
		CommissionEmployee9_4 employee = new CommissionEmployee9_4("Sue",
						"Jones", "222-22-2222", 10000, .06);
	
	System.out.println("Employee information obtained by get methods: \n");
	
	System.out.printf("%s %s\n", "First Name is", employee.getFirstName() );
	System.out.printf("%s %s\n", "Last Name is", employee.getLastName() );
	System.out.printf("%s %s\n", "Social security number is", employee.getSocialSecurityNumber() );
	System.out.printf("%s %s\n", "Gross sales is", employee.getGrossSales() );
	System.out.printf("%s %s\n", "Commission rate is", employee.getCommissionRate() );
	
	employee.setGrossSales( 500 );
	employee.setCommissionRate( .1 );
	
	System.out.printf("\n%s:\n\n%s\n", 
			"Updated employee information obtained by toString", employee);
	
	}

}
