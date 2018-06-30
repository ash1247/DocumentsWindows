import java.util.Scanner;

//Program for finding the smallest and the largest integer from user given 5 integers

public class Ex224 {
	
			public static void main ( String [] args)
			{
				Scanner input = new Scanner( System.in);
				
				  System.out.print("Enter a integer: ");
			        int a = input.nextInt();
			       System.out.print("Enter a integer: ");
			        int b = input.nextInt();
			       System.out.print("Enter a integer: ");
			        int c = input.nextInt();
			       System.out.print("Enter a integer: ");
			        int d = input.nextInt();
			       System.out.print("Enter a integer: ");
			        int e = input.nextInt();

			        // calculate highest
			        System.out.printf("Highest: %d\n",
			                Math.max(a, Math.max(b, (Math.max(c, Math.max(d, e))))));

			        // calculate lowest
			        System.out.printf("Lowest: %d\n",
			                Math.min(a, Math.min(b, (Math.min(c, Math.min(d, e))))));
			    }
}
					
			
	



