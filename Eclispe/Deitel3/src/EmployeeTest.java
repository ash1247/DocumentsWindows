
public class EmployeeTest {

	public static void main(String[] args)
	{
		Ex3_14 employee1 = new Ex3_14("Masud", "Rana", 250000.00);
		Ex3_14 employee2 = new Ex3_14("Himel", "Dhar", 2500.00);
		System.out.printf("Employee list.\n");
		System.out.printf("\nDefault salary will be set to zero if entered anything other than positive number.\n");
		employee1.displayMessage();
		employee2.displayMessage();
		employee1.displayMessage2();
		employee2.displayMessage2();
	}
}
