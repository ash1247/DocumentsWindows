
public class BasePlusCommissionEmployee9_11 extends CommissionEmployee9_10 {

	
	public double baseSalary;
	
	public BasePlusCommissionEmployee9_11(String first, String last, String ssn, 
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
		return getBaseSalary() + super.earnings() ;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s: %s\n%s: %.2f\n",
						"base-salaried", super.toString(),
						"base salary", getBaseSalary() );
	}

}


