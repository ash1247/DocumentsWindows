class Employee_Info {
	
	public int id;
	public String name;
	private int salary;
	
	void setSalary(int sal)
	{
		salary = sal;
		System.out.printf("%d ", sal);
	}
	int getSalary()
	{
		return salary;
	}
}

public class Access_Modifier
{
	public static void main(String [] args)
	{
		Employee_Info emp1 = new Employee_Info();
		emp1.id = 1;
		emp1.name = "Niramish";
		//int salary = 3000000;
		
		//emp1.salary = 30000;
		
		emp1.setSalary(30000);
		
		System.out.println("The salary of " + emp1.name + " is " + emp1.getSalary());
	}

}