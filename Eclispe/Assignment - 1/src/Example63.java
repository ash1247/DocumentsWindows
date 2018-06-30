//Example 6.3
//Program on determining largest value from 3 integers
public class Example63 {

	public static void main(String[] args) {
		
		int a = 325;
		int b = 712;
		int c = 478;
		System.out.print("Largest value is: ");
		
		if ( a > b)
		{
			if ( a > c)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(c);
			}
		}
		else
		{
			if (c > b)
			{
				System.out.println(c);
			}
			else
			{
				System.out.println(b);
			}
		}
	}

}
