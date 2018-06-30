//Example 5.4
//program of sum of (1 + 1/2 + 1/3 + 1/4.......1/10) series
public class Example54 {
	public static void main(String [] args)
	{
		float sum;
		int i;
		sum = 0.0F;
				for( i = 1; i <= 10; i++)
				{
					sum = sum + 1/(float)i;
					System.out.print(" i = " + i);
					System.out.println("   sum = " + sum);
				}
	}

}
