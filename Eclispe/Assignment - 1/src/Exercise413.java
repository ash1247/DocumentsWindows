//Exercise 4.13
//program of sum of (1 + 1/2 + 1/3 + 1/4.......1/n) series where user put value of n
import java.util.Scanner;
public class Exercise413 {
		public static void main(String [] args)
		{
			Scanner input = new Scanner(System.in);
		
			System.out.print("Please enter the value of n = ");
			
		    int n = input.nextInt();
		   
			float ans = 0 ;
			
			for (int i = 1; i <= n; i++) {
			ans = ans + (float) 1 / i;
			
			}
			System.out.println("Sum = " +ans);
			
		}	
}
