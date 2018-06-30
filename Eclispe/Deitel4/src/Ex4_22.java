/***********************************************************************
 * Output table
 * @Ashikul Hosen
 * email: sagor.ashikul@gmail.com
 * version 1.0
 ***********************************************************************/
public class Ex4_22 {
	
	public static void main(String[] args)
	{
		int n = 1; 
		
		System.out.printf("%s   %2s  %4s   %8s\n", "N", "10*N", "100*N", "1000*N" );
		System.out.println();
		while (n <= 5 )
		{
			System.out.printf("%d   %2d   %4d   %8d", n, 10 * n, 100 * n, 1000 * n);
			n++;
			System.out.println();
		}
	}
}
