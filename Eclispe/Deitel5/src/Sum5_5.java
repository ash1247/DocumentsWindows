public class Sum5_5 {

	public static void main(String[] args)
	{
		int total = 0;
		
		for (int number = 2; number <=20; number += 2)
		{
			total += number;
		}
		System.out.printf("Sum is %d\n", total);
		
		for (int i = 99; i >= 0; i -= 11)
		{
			System.out.printf("%d\n", i);
		}
		
		for (int i = 100; i >= 1; i -= 1)
		{
			System.out.printf("%d\n", i);
		}
	}
}
