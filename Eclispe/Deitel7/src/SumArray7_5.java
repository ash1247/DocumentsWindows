
public class SumArray7_5 {

	public static void main(String[] args)
	{
		int[] array = { 87, 68, 94, 100, 83, 75, 45, 98, 32, 85};
		int total = 0;
		
		for(int counter = 0; counter < array.length; counter++)
			total += array[counter];
		
		System.out.printf("Total: %d\n", total);
		
	}
}
