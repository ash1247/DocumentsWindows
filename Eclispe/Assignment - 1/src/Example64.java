//Example 6.4
////Program of counting for the given values and categorize them.
public class Example64 {

	public static void main(String[] args) 
	{
		int rollNumber[] = { 111, 222, 333, 444};
		int marks[] = { 81, 75, 43, 58};
		for (int i = 0; i< rollNumber.length; i++)
		{
			if (marks[i] > 79)
				System.out.println(rollNumber[i] +  " Honours");
			else if (marks[i] > 59)
				System.out.println(rollNumber[i] + " I Division");
			else if (marks[i] > 49)
				System.out.println(rollNumber[i] + " II Division");
			else 
				System.out.println(rollNumber[i] + " FAIL");
		}

	}

}
