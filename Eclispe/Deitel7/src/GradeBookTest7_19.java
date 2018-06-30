
public class GradeBookTest7_19 {

	public static void main(String [] args)
	{
		int[][] gradesArray = { { 87, 68, 94 }, 
								{ 90, 83, 78 },
								{ 85, 91, 76 }, 
								{ 87, 69, 81 },
								{ 91, 94, 80},
								{ 90, 83, 78 },
								{ 85, 91, 76 }, 
								{ 87, 69, 77 },
								{ 91, 74, 100},
								{ 88, 69, 96 } };
		
		GradeBook7_18 myGradeBook = new GradeBook7_18("CS 101", gradesArray);
		
		myGradeBook.displayMessage();
		myGradeBook.processGrades();
	}
}
