
public class EmployeeTest {

	public static void main(String[] args )
	{
		Date8_7 birth = new Date8_7( 7, 24, 1949 );
		Date8_7 hire = new Date8_7( 3, 23, 1989 );
		
		Employee8_8 employee = new Employee8_8("Bob", "Blue", birth, hire );
		
		System.out.println( employee );
	}
}
