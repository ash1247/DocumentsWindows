//Class Health Records

public class Ex3_17 {

	private String firstName;
	private String lastName;
	private String gender;
	private int day;
	private int month;
	private int year;
	private double weight;
	private double height;
	double bmi;

	
	public Ex3_17(String fName, String lName, String gende, int da, int mont, int yea, double weigh, double heigh)
	{
		firstName = fName;
		lastName = lName;
		gender = gende;
		day = da;
		month = mont;
		year = yea;
		weight = weigh;
		height = heigh;
	}
	
	public void setFirstName(String fName)
	{
		firstName = fName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setLastName(String lName)
	{
		lastName = lName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setGender(String gende)
	{
		gender = gende;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public void setDay(int da)
	{
		day = da;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public void setMonth(int mont)
	{
		month = mont;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setYear(int yea)
	{
		year = yea;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setWeight(double weigh)
	{
		weight = weigh;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setHeight(double heigh)
	{
		weight = heigh;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double ageCalculator()
	{
		 return java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - year;
	}
	
	public double maximumHeartRates()
	{
		return (220 - ageCalculator() );
	}
	
	public double targetHeartRateLow()
	{
		return ( maximumHeartRates() *  50 / 100 );
	}
	
	public double targetHeartRateHigh()
	{
		return ( maximumHeartRates() *  85 / 100 );
	}
	
	public double BMI()
	{	
		bmi = (weight / ( ( height * height) / (100 * 100) ) );
		
		return bmi;
	}

	
	public void displayMessage()
	{
		System.out.printf("\n\nFirst Name: %s\n", firstName);
		System.out.printf("Last Name: %s\n", lastName );
		System.out.printf("Gender: %s\n", gender );
		System.out.printf("Date Of Birth: %d/%d/%d\n", day, month, year);
		System.out.printf("Age: %.1f\n", ageCalculator() );
		System.out.printf("Maximum Heart Rate: %.2f\n", maximumHeartRates() );
		System.out.printf("Target Heart Rate: %.2f - %.2f\n", targetHeartRateLow(), targetHeartRateHigh() );
		
		if (BMI() > 0 && BMI() < 18.5)
			System.out.printf("BMI = %.2f, Underweight.", BMI() );
		else if (BMI() > 18.5 && BMI() < 24.9 )
			System.out.printf("BMI = %.2f, Normal.", BMI() );
		else if (BMI() > 25 && BMI() < 29.9)
			System.out.printf("BMI = %.2f, Overweight.", BMI() );
		else 
			System.out.printf("BMI = %.f, Obese.", BMI() );
	
	}
	
	
}
