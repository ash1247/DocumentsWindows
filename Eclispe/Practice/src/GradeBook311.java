public class GradeBook311 {

	public static void main(String[] args)
	{
		GradeBook310 gradebook1 = new GradeBook310("CS 101", "Sue");
		GradeBook310 gradebook2 = new GradeBook310("CS 102", "Storm");
		
		gradebook1.displayMessage();
		System.out.printf("\nGradebook - 1 course name is %s\n", gradebook1.getCourseName(),gradebook1.getInstructorName() );
		System.out.printf("This course is presented by %s\n", gradebook1.getInstructorName() );
		gradebook2.displayMessage();
		System.out.printf("\n\nGradebook - 2 course name is %s\n", gradebook2.getCourseName() );
		System.out.printf("This course is presented by %s\n", gradebook2.getInstructorName() );
	}
}
