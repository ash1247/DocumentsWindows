//Example 6.2
//Program of counting for the given values and categorize them as even or odd.
public class Example62 {
		public static void main(String [] args)
		{
			int number[] = { 50, 65, 56, 71, 81};
			int even = 0;
			int odd = 0;
			for (int i = 0; i < number.length; i++)
			{
				if ((number[i] % 2) == 0)
				{
					even += 1;
				}
				else
				{
					odd += 1;
				}
			}
			System.out.println("Even Numbers : " + even + " Odd Numbers : " + odd);
		}
}
