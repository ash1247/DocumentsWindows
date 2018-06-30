public class PayrollSystemTest10_9 {

	public static void main(String[] args)
	{
		SalariedEmployee10_5 salariedEmployee = new SalariedEmployee10_5(
				"John", "Smith", "111-11-1111", 800.00 );
		
		HourlyEmployee10_6 hourlyEmployee = new HourlyEmployee10_6( 
				"Karen", "Price", "222-22-2222", 16.75, 40 );
		
		CommissionEmployee10_7 commissionEmployee = new CommissionEmployee10_7
				("Sue", "Jones", "333-33-33330", 10000, 0.06);
		
		BasePlusCommissionEmployee10_8 basePlusCommissionEmployee = new BasePlusCommissionEmployee10_8(
				"Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);
		
		System.out.println( "Employees processed individually:\n" );
		
		System.out.printf( "%s\n%s: $%,.2f\n\n", salariedEmployee, 
				"earned", salariedEmployee.earnings() );
		
		System.out.printf( "%s\n%s: $%,.2f\n\n", hourlyEmployee,
				"earned", salariedEmployee.earnings() );
		
		System.out.printf( "%s\n%s: $%,.2f\n\n", commissionEmployee,
				"earned", commissionEmployee.earnings() );
		
		System.out.printf( "%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee,
				"earned", basePlusCommissionEmployee.earnings() );
		
		Employee10_4[] employees = new Employee10_4[ 4 ];
		
		employees[ 0 ] = salariedEmployee;
		employees[ 1 ] = hourlyEmployee;
		employees[ 2 ] = commissionEmployee;
		employees[ 3 ] = basePlusCommissionEmployee;
		
		System.out.println("Employess processed polymorphically:\n");
		
		for(Employee10_4 currentEmployee : employees )
		{
			System.out.println( currentEmployee );
		
			if( currentEmployee instanceof BasePlusCommissionEmployee10_8 )
			{
				BasePlusCommissionEmployee10_8 employee = ( BasePlusCommissionEmployee10_8) currentEmployee;
				
				employee.setBaseSalary( 1.10 * employee.getBaseSalary() );
				
				System.out.printf( "new base salary with 10%% increase is: $%,.2f\n", employee.getBaseSalary() );
			}
			
			System.out.printf("earned $%,.2f\n\n", currentEmployee.earnings() );
		}
	
		for( int j = 0; j < employees.length; j++ )
			System.out.printf( "Employee %d is a %s\n", j, 
					employees[ j ].getClass().getName() );
		
	}
}
