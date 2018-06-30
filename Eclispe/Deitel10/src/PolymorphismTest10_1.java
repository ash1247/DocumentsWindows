
public class PolymorphismTest10_1 {

	public static void main(String [] args)
	{
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, 0.06);
		
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Suer", "Joneess", "333-22-2222", 5000, 0.04, 300);

		System.out.printf( "%s %s:\n\n%s\n\n",
				 "Call CommissionEmployee's toString with superclass reference ",
				  "to superclass object", commissionEmployee.toString() );
	
		System.out.printf( "%s %s:\n\n%s\n\n",
					"Call BasePlusCommissionEmployee's toString with subclass",
					"reference to subclass object", basePlusCommissionEmployee.toString() );
		
		CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;
		
		System.out.printf( "%s %s:\n\n%s\n",
					"Call BasePlusCommissionEmployee's toString with superclass",
					"reference to subclass object", commissionEmployee2.toString() );
	}
}
