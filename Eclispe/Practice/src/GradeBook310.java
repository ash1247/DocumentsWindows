public class GradeBook310 
{
	private String courseName;
	private String instructorName;
	
	public GradeBook310( String name, String instructor )
	{
		courseName = name;
		instructorName = instructor;
	}
	
	public void setCourseName( String name, String instructor)
	{
		courseName = name;
		instructorName = instructor;
	}
	public String getCourseName()
	{
		return courseName;
	}
	public String getInstructorName()
	{
		return instructorName;
	}
	public void displayMessage()
	
	{
		System.out.printf("\nWelcome to the grade book for\n%s!", getCourseName() );
	}
}
