public class Practice2 {

	public static void main(String [] args)
	{
		int count;
		
		for(count = 1; count <= 10; count++)
		{
			if(count == 5)
				continue;
			
			System.out.printf("%d ", count);
		}
		
		System.out.printf("\nBroke out of loop at count = %d\n", count);
	}
}
