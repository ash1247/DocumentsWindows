import java.util.HashSet;
import java.util.Scanner;

public class HashSetImplimentations {

	public static void main( String[] args)
	{
		HashSet h = new HashSet();
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter how many inputs you want to input: ");
	
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println();
		System.out.println(h);
		}
}


