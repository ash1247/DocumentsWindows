import java.util.*;

class Cmain {

	public static void main (String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String s;
		int count = 1;
		Fact f = new Fact();
		
		
		s = input.nextLine();
		
		while( s != null )
		{	
			System.out.printf("%s" , s);
			
			s = s.trim();
			System.out.printf("%s" , s);
			long i = s.length();	
			System.out.printf("Case %d: %d\n", count, f.fact(i));
			count++;
			s = input.nextLine();
		}
	}

}
class Fact {
		
	long fact(long i) 
	{
		long result;
		
		if(i==1) 
			return 1;
			
		result = fact(i-1) * i;
			return result;
		}
	
}
