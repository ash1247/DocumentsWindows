//fig 7.15
public class GradeBookTest {

	public static void main(String [] args)
	{
		int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87, 69, 81 };
		
		GradeBook myGradeBook = new GradeBook("CS 101", gradesArray);
		
		myGradeBook.displayMessage();
		myGradeBook.processGrades();
	}
}
