import java.util.HashSet;
import java.util.Scanner;

public class Repitition {

	public static void main(String [] args)
	{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input numbers one by one");
		System.out.println("Enter -1 to exit.");
		int i = scanner.nextInt();
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while(i != -1 )
		{
			System.out.println("Please input numbers one by one");
			System.out.println("Enter -1 to exit.");
			i = scanner.nextInt();
			hs.add(i);
			
			if( i == -1)
			{
				hs.remove(-1);
				break;
			}
			
		}
		
		System.out.println(hs);
		
	}
}
