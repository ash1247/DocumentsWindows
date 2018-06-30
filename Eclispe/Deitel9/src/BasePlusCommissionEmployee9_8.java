
public class BasePlusCommissionEmployee9_8 extends CommissionEmployee9_4 {

	
	public double baseSalary;
	
	public BasePlusCommissionEmployee9_8(String first, String last, String ssn, 
								double sales, double rate, double salary) 
	{
		super(first, last, ssn, sales, rate);
		
		setBaseSalary( salary );
	}
	
	public void setBaseSalary( double salary )
	{
		if ( salary >= 0.0 )
			baseSalary = salary;
		else 
			throw new IllegalArgumentException("Base salary must be >= 0.0" );
	}
	
	public double getBaseSalary()
	{
		return baseSalary;
	}
	
	@Override
	public double earnings()
	{
		return baseSalary + ( commissionRate * grossSales );
	}
	
	@Override
	public String toString()
	{
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
						"base-salaried commission employee", firstName, lastName,
						"social security number", socialSecurityNumber,
						"gross sales", grossSales, "commission rate", commissionRate,
						"base salary", baseSalary );
	}

}
