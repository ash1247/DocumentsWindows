

public class StudentRecordTest {
	
	public static void main( String[] args )
	{
		System.out.println("Welcome to the student record application\n");
		System.out.println("Please follow the instructions.\n");
		CreateStudentRecord application = new CreateStudentRecord();
		
		application.openFile();
		application.addRecords();
		application.openFile2();
		application.closeFile();
		application.readRecords();
		application.closeFile2();
	} // end main

}
