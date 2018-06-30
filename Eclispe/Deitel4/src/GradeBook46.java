import java.util.Scanner;
public class GradeBook46 {
	private String courseName;
	
	public GradeBook46(String name)
	{
		courseName = name;
	}
	
	public void setCourse(String name)
	{
		courseName = name;
	}
	public String getCourseName()
	{
		return courseName;
	}
	
	public void displayMessage()
	{
		System.out.printf("Welcome to the grade book for \n%s!\n\n", getCourseName());
	}
	public void determineClassAverage()
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int total;
		int gradeCounter;
		int grade;
		int average;
		
		total = 0;
		gradeCounter = 1;
		
		while (gradeCounter <= 10)
		{
			System.out.print("Enter obtained mark: ");
			grade = input.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1;
		}
		average = total / 10;
		System.out.printf("\nTotal of all 10 marks is %d\n", total);
		System.out.printf("Class average is %d\n", average );
	}
}