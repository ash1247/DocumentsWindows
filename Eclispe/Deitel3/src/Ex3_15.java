
public class Ex3_15 {

	private int month;
	private int day;
	private int year;
	
	public Ex3_15(int da, int mont, int yea)
	{
		month = mont;
		year = yea;
		day = da;
	}
	
	public void setMonth(int mont)
	{
		month = mont;
	}
	
	public void setDay(int da)
	{
		day = da;
	}
	
	public void setYear(int yea)
	{
		year = yea;
	}
	
	public void displayDate()
	{
		System.out.printf("Date: %d/%d/%d", day, month, year);
	}

}
